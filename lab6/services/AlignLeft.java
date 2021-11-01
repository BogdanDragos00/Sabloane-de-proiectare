package lab6.services;

import lab6.models.Context;
import lab6.models.Paragraph;

public class AlignLeft implements AlignStrategy{

    public void render(Paragraph paragraph, Context context) {
        // TODO Auto-generated method stub
        System.out.println("Align left: " + paragraph);
    }

    
}
