 package com.carjo.client.layouts;  

public class client_home_con_horzintal extends com.codename1.ui.Container {
    public client_home_con_horzintal() {
        this(com.codename1.ui.util.Resources.getGlobalResources());

    }
    
    public client_home_con_horzintal(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
        /// ...
    }
    
//////-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Container gui_Container = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.Label gui_lbl_img = new com.codename1.ui.Label();
    protected com.codename1.ui.Label gui_lbl_type = new com.codename1.ui.Label();
    protected com.codename1.ui.Label gui_lbl_price = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
                setInlineStylesTheme(resourceObjectInstance);
        setName("client_home_con_horzintal");
        gui_Container.setPreferredSizeStr("30.568668mm 36.9746mm");
                gui_Container.setInlineStylesTheme(resourceObjectInstance);
        gui_Container.setInlineAllStyles("border:roundRect stroke(1.0px ececec) -top-left -top-right +bottom-left +bottom-right 0.5mm;");
        gui_Container.setName("Container");
        addComponent(gui_Container);
        gui_lbl_img.setPreferredSizeStr("30.568668mm 20.56642mm");
        gui_lbl_img.setText("");
                gui_lbl_img.setInlineStylesTheme(resourceObjectInstance);
        gui_lbl_img.setName("lbl_img");
        gui_lbl_type.setPreferredSizeStr("29.66959mm 7.4173975mm");
        gui_lbl_type.setText("Compact");
                gui_lbl_type.setInlineStylesTheme(resourceObjectInstance);
        gui_lbl_type.setName("lbl_type");
        gui_lbl_price.setPreferredSizeStr("29.66959mm 7.9793215mm");
        gui_lbl_price.setText("473 Jd");
                gui_lbl_price.setInlineStylesTheme(resourceObjectInstance);
        gui_lbl_price.setName("lbl_price");
        gui_Container.addComponent(gui_lbl_img);
        gui_Container.addComponent(gui_lbl_type);
        gui_Container.addComponent(gui_lbl_price);
        ((com.codename1.ui.layouts.LayeredLayout)gui_lbl_img.getParent().getLayout()).setInsets(gui_lbl_img, "0.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_lbl_img, "-1 -1 -1 -1").setReferencePositions(gui_lbl_img, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_lbl_type.getParent().getLayout()).setInsets(gui_lbl_type, "1.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_lbl_type, "0 -1 -1 -1").setReferencePositions(gui_lbl_type, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_lbl_price.getParent().getLayout()).setInsets(gui_lbl_price, "0.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_lbl_price, "1 -1 -1 -1").setReferencePositions(gui_lbl_price, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredWidthMM((float)30.568668);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredHeightMM((float)36.9746);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getParent().getLayout()).setInsets(gui_Container, "auto auto auto auto").setReferenceComponents(gui_Container, "-1 -1 -1 -1").setReferencePositions(gui_Container, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}