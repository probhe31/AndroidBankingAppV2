package com.probe31.probe.bankingappv6.viewmodels;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import com.probe31.probe.bankingappv6.models.User;
import com.probe31.probe.bankingappv6.repositories.UserRepository;
import javax.inject.Inject;

public class UserProfileViewModel extends ViewModel {

    /*private LiveData<User> user;
    public LiveData<User> getUser() {
        return user;
    }*/

    private LiveData<User> user;
    private UserRepository userRepo;

    @Inject // UserRepository parameter is provided by Dagger 2
    public UserProfileViewModel(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void init(String userId) {
        if (this.user != null) {
            // ViewModel is created per Fragment so
            // we know the userId won't change
            return;
        }
        user = userRepo.getUser(userId);
    }

    public LiveData<User> getUser() {
        return this.user;
    }

}
