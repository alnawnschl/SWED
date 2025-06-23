package Exercise4;

public class HtmlContentComparison implements ContentComparison {
    @Override
    public boolean isContentIdentical(String oldContent, String newContent) {
        if (oldContent == null || newContent == null) {
            return oldContent == newContent;
        }
        return oldContent.equals(newContent);
    }
}

