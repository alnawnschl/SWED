package Exercise4;

public class TextContentComparison implements ContentComparison {
    @Override
    public boolean isContentIdentical(String oldContent, String newContent) {
        if (oldContent == null || newContent == null) {
            return oldContent == newContent;
        }
        String oldText = oldContent.replaceAll("<[^>]*>", "").trim();
        String newText = newContent.replaceAll("<[^>]*>", "").trim();
        return oldText.equals(newText);
    }
}

