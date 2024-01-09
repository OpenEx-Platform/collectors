package io.openex.collectors.users;

import io.openex.collectors.users.config.UsersCollectorConfig;
import io.openex.collectors.users.service.UsersCollectorService;
import io.openex.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.time.Duration;
import java.util.Optional;

@Component
public class UsersCollector {

    private UsersCollectorConfig usersCollectorConfig;

    private TaskScheduler taskScheduler;

    private UserRepository userRepository;

    @Autowired
    public void setUsersCollectorConfig(UsersCollectorConfig usersCollectorConfig) {
        this.usersCollectorConfig = usersCollectorConfig;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setTaskScheduler(TaskScheduler taskScheduler) {
        this.taskScheduler = taskScheduler;
    }

    @PostConstruct
    public void init() {
        // If enabled, scheduled every 5 seconds
        if (Optional.ofNullable(usersCollectorConfig.getEnable()).orElse(false)) {
            UsersCollectorService task = new UsersCollectorService(userRepository);
            taskScheduler.scheduleAtFixedRate(task, Duration.ofSeconds(5));
        }
    }
}
