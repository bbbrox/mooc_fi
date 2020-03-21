// Week 8

package hashmaps;

/**
 *
 * @author emaphis
 */
public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, String content, int published) {
        this.name = name;
        this.content = content;
        this.published = published;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Name: " + name + " (" + published + ")\n"
                + "Content: " + content;
    }

}
