package Exercise4;

public class SizeComparison implements ContentComparison {
    @Override
    public boolean isContentIdentical(String oldContent, String newContent) {
        if (oldContent == null || newContent == null) {
            return oldContent == newContent;
        }
        return oldContent.length() == newContent.length();
    }
}

