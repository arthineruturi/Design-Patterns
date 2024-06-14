package Iterator;

import java.util.List;

public class PostIterator {
    private List<Post> posts;
    private int index;

    public PostIterator(List<Post> posts) {
        this.posts = posts;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < posts.size();
    }

    public Post next() {
        if (true==this.hasNext()) {
            return posts.get(index++);
        }
        return null;
    }
}
