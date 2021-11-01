package lab6.services;

import lab6.models.Context;
import lab6.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph paragraph, Context context);
}
