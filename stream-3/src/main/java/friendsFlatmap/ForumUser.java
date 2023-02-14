package friendsFlatmap;

import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
public final class ForumUser {

    @NonNull
    private final String username;
    @NonNull
    private final String realName;
    @NonNull
    private final String location;

    private final Set<ForumUser> friends = new HashSet<>();


    public void addFriend(ForumUser user) {
        friends.add(user);
    }
    public boolean removeFriend(ForumUser user) {
        return friends.remove(user);
    }
    public Set<ForumUser> getFriends() {
        return friends;
    }
    public Set<String> getLocationsOfFriends() {
        return friends.stream()
                .map(ForumUser::getLocation)
                .collect(Collectors.toSet());
    }
     public Set<String> getLocationsOfFriendsOfFriends() {
        return friends.stream()
                .flatMap(user -> user.getFriends().stream())
                .filter(user -> user != this)
                .map(user -> user.getLocation())
                .collect(Collectors.toSet());
     }
}
