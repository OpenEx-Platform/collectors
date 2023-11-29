package io.openex.collectors.users.service;

import io.openex.database.model.User;
import io.openex.database.repository.UserRepository;

import java.util.List;

import static io.openex.helper.StreamHelper.fromIterable;

public class UsersCollectorService implements Runnable {

    private final UserRepository userRepository;

    public UsersCollectorService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run() {
        List<User> users = fromIterable(userRepository.findAll());
        System.out.println("User collector provisioning based on " + users.size() + " users");
        // TODO
    }
}
