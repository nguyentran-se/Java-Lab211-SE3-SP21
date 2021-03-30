package Exception;

import java.io.IOException;

public class NotSupportFileType extends IOException{
    /**
     *@author NguyenQuyBao
     *@since 8/3/2021
     */
    private static final long serialVersionUID = 1L;

    public NotSupportFileType(String s){
        super(s);
    }
}