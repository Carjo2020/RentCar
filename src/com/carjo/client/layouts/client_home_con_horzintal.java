package com.carjo.client.layouts;

import com.cn2.ui.cn1Icons;
import com.codename1.ui.CN;

public class client_home_con_horzintal extends com.codename1.ui.Container {

    boolean enable = false;

    public client_home_con_horzintal() {
        this(com.codename1.ui.util.Resources.getGlobalResources());

    }

    public client_home_con_horzintal(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
        gui_btn_favorite.setIcon(new cn1Icons().getImage("favorite border", "unfavorite", 6));
        gui_btn_favorite.addActionListener(e -> {
            if (enable) {
                gui_btn_favorite.setIcon(new cn1Icons().getImage("favorite border", "unfavorite", 6));
                enable = false;
                CN.getCurrentForm().revalidate();
            } else {
                gui_btn_favorite.setIcon(new cn1Icons().getImage("favorite", "favorite", 6));
                enable = true;
                   CN.getCurrentForm().revalidate();
            }
        });
    }
//    favorite
//////////////////-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Container gui_Container = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.components.ScaleImageLabel gui_lbl_img = new com.codename1.components.ScaleImageLabel();
    protected com.codename1.ui.Label gui_lbl_price = new com.codename1.ui.Label();
    protected com.codename1.ui.Button gui_btn_favorite = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
                setInlineStylesTheme(resourceObjectInstance);
        setName("client_home_con_horzintal");
        gui_Container.setPreferredSizeStr("26.719578mm 26.455027mm");
        gui_Container.setUIID("client_home_con_horzintal");
                gui_Container.setInlineStylesTheme(resourceObjectInstance);
        gui_Container.setName("Container");
        addComponent(gui_Container);
        gui_lbl_img.setPreferredSizeStr("28.571428mm 17.724869mm");
                gui_lbl_img.setInlineStylesTheme(resourceObjectInstance);
        gui_lbl_img.setInlineAllStyles("bgImage:3.jpg;");
        gui_lbl_img.setName("lbl_img");
        gui_lbl_price.setPreferredSizeStr("38.095238mm 6.878307mm");
        gui_lbl_price.setText("450 Jd");
        gui_lbl_price.setUIID("btn_ronded_white");
                gui_lbl_price.setInlineStylesTheme(resourceObjectInstance);
        gui_lbl_price.setName("lbl_price");
        gui_btn_favorite.setPreferredSizeStr("6.0846562mm 6.3492064mm");
        gui_btn_favorite.setText("");
                gui_btn_favorite.setInlineStylesTheme(resourceObjectInstance);
        gui_btn_favorite.setName("btn_favorite");
        gui_Container.addComponent(gui_lbl_img);
        gui_Container.addComponent(gui_lbl_price);
        gui_Container.addComponent(gui_btn_favorite);
        ((com.codename1.ui.layouts.LayeredLayout)gui_lbl_img.getParent().getLayout()).setInsets(gui_lbl_img, "1.0mm 2.0mm auto 2.0mm").setReferenceComponents(gui_lbl_img, "-1 -1 -1 -1").setReferencePositions(gui_lbl_img, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_lbl_price.getParent().getLayout()).setInsets(gui_lbl_price, "0.0mm 3.0mm 0.0mm 3.0mm").setReferenceComponents(gui_lbl_price, "0 -1 -1 -1").setReferencePositions(gui_lbl_price, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_btn_favorite.getParent().getLayout()).setInsets(gui_btn_favorite, "-5.9604645E-8mm 0.0mm auto auto").setReferenceComponents(gui_btn_favorite, "-1 -1 -1 -1").setReferencePositions(gui_btn_favorite, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredWidthMM((float)26.984127);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredHeightMM((float)26.455027);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getParent().getLayout()).setInsets(gui_Container, "-0.2mm auto -0.2mm auto").setReferenceComponents(gui_Container, "-1 -1 -1 -1").setReferencePositions(gui_Container, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
