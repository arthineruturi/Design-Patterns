package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Post 1: This is the first post!"));
        posts.add(new Post("Post 2: Here is the second post."));
        posts.add(new Post("Post 3: And this is the third post."));

     
        PostIterator iterator = new PostIterator(posts);

        while (iterator.hasNext()) {
            Post currentPost = iterator.next();
            System.out.println("Current Post: " + currentPost.getContent());
        }
    }
}
