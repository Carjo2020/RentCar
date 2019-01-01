package com.carjo.client.forms;

import com.carjo.client.layouts.client_home_con_horzintal;
import com.codename1.ui.CheckBox;
import com.codename1.ui.util.Resources;

public class client_home extends cBaseForm {

    Resources res;

    public client_home() {
        this(com.codename1.ui.util.Resources.getGlobalResources());

    }

    public client_home(com.codename1.ui.util.Resources res) {
        initGuiBuilderComponents(res);
        this.res = res;
        installTitleArea(res);
        installFixItems();
        installContainer();
    }

//////////-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Container gui_Container = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    protected com.codename1.ui.Container gui_con_brand = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();
    protected com.codename1.ui.Button gui_btn_search = new com.codename1.ui.Button();
    protected com.codename1.ui.Container gui_Container_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.TextField gui_tf_to = new com.codename1.ui.TextField();
    protected com.codename1.ui.TextField gui_tf_from = new com.codename1.ui.TextField();
    protected com.codename1.ui.Container gui_Container_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.Container gui_con_horzintal = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    protected com.codename1.ui.Container gui_con_vertical = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("client_home");
        setName("client_home");
        gui_Container.setPreferredSizeStr("inherit 14.94718mm");
                gui_Container.setInlineStylesTheme(resourceObjectInstance);
        gui_Container.setInlineAllStyles("bgColor:f0f0f0; transparency:255;");
        gui_Container.setName("Container");
                gui_Container_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Container_1.setName("Container_1");
        addComponent(gui_Container);
        gui_Label.setPreferredSizeStr("11.238481mm 5.3944707mm");
        gui_Label.setText("Brand");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setInlineAllStyles("fgColor:0;");
        gui_Label.setName("Label");
        gui_con_brand.setPreferredSizeStr("45.740616mm 7.4173975mm");
                gui_con_brand.setInlineStylesTheme(resourceObjectInstance);
        gui_con_brand.setName("con_brand");
        gui_Label_1.setPreferredSizeStr("10.901326mm 7.4173975mm");
        gui_Label_1.setText("Price");
                gui_Label_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_1.setInlineAllStyles("fgColor:0;");
        gui_Label_1.setName("Label_1");
        gui_btn_search.setPreferredSizeStr("inherit 17.419645mm");
        gui_btn_search.setText("Search");
                gui_btn_search.setInlineStylesTheme(resourceObjectInstance);
        gui_btn_search.setInlineAllStyles("bgColor:8dff; fgColor:ffffff; transparency:255;");
        gui_btn_search.setName("btn_search");
        gui_Container_2.setPreferredSizeStr("40.346146mm 7.4173975mm");
                gui_Container_2.setInlineStylesTheme(resourceObjectInstance);
        gui_Container_2.setName("Container_2");
        gui_Container.addComponent(gui_Label);
        gui_Container.addComponent(gui_con_brand);
        gui_Container.addComponent(gui_Label_1);
        gui_Container.addComponent(gui_btn_search);
        gui_Container.addComponent(gui_Container_2);
        gui_tf_to.setPreferredSizeStr("15.509104mm 4.720162mm");
        gui_tf_to.setHint("To");
                gui_tf_to.setInlineStylesTheme(resourceObjectInstance);
        gui_tf_to.setName("tf_to");
        gui_tf_to.setConstraint(com.codename1.ui.TextArea.NUMERIC);
        gui_tf_from.setPreferredSizeStr("15.509104mm 5.3944707mm");
        gui_tf_from.setHint("From");
        gui_tf_from.setText("");
                gui_tf_from.setInlineStylesTheme(resourceObjectInstance);
        gui_tf_from.setName("tf_from");
        gui_tf_from.setConstraint(com.codename1.ui.TextArea.NUMERIC);
        gui_Container_2.addComponent(gui_tf_to);
        gui_Container_2.addComponent(gui_tf_from);
        ((com.codename1.ui.layouts.LayeredLayout)gui_tf_to.getParent().getLayout()).setInsets(gui_tf_to, "0.0mm -4.4703484E-8mm 0.0mm 52.87009%").setReferenceComponents(gui_tf_to, "-1 -1 -1 -1").setReferencePositions(gui_tf_to, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_tf_from.getParent().getLayout()).setInsets(gui_tf_from, "0.0mm 52.87009% 0.0mm 0.0mm").setReferenceComponents(gui_tf_from, "-1 -1 -1 -1").setReferencePositions(gui_tf_from, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label.getParent().getLayout()).setInsets(gui_Label, "0.0mm auto 50.0% 0.0mm").setReferenceComponents(gui_Label, "-1 -1 -1 -1").setReferencePositions(gui_Label, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_con_brand.getLayout()).setPreferredWidthMM((float)45.740616);
        ((com.codename1.ui.layouts.LayeredLayout)gui_con_brand.getLayout()).setPreferredHeightMM((float)7.4173975);
        ((com.codename1.ui.layouts.LayeredLayout)gui_con_brand.getParent().getLayout()).setInsets(gui_con_brand, "0.0mm 0.0mm 50.0% 0.0mm").setReferenceComponents(gui_con_brand, "0 3 -1 0 ").setReferencePositions(gui_con_brand, "0.0 1.0 0.0 1.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label_1.getParent().getLayout()).setInsets(gui_Label_1, "0.0mm 0.0mm 0.0mm 0.3371544mm").setReferenceComponents(gui_Label_1, "0 0 -1 -1").setReferencePositions(gui_Label_1, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_btn_search.getParent().getLayout()).setInsets(gui_btn_search, "1.0mm 1.0mm 1.0mm auto").setReferenceComponents(gui_btn_search, "-1 -1 -1 -1").setReferencePositions(gui_btn_search, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_2.getLayout()).setPreferredWidthMM((float)40.346146);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_2.getLayout()).setPreferredHeightMM((float)7.4173975);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_2.getParent().getLayout()).setInsets(gui_Container_2, "0.0mm 0.0mm 0.0mm 0.0mm").setReferenceComponents(gui_Container_2, "0 3 -1 0 ").setReferencePositions(gui_Container_2, "1.0 1.0 0.0 1.0");
        addComponent(gui_Container_1);
        gui_con_horzintal.setPreferredSizeStr("59.002026mm 18.431108mm");
                gui_con_horzintal.setInlineStylesTheme(resourceObjectInstance);
        gui_con_horzintal.setName("con_horzintal");
        gui_con_vertical.setPreferredSizeStr("51.921783mm 70.12812mm");
                gui_con_vertical.setInlineStylesTheme(resourceObjectInstance);
        gui_con_vertical.setName("con_vertical");
        gui_Container_1.addComponent(gui_con_horzintal);
        gui_Container_1.addComponent(gui_con_vertical);
        ((com.codename1.ui.layouts.LayeredLayout)gui_con_horzintal.getParent().getLayout()).setInsets(gui_con_horzintal, "0.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_con_horzintal, "-1 -1 -1 -1").setReferencePositions(gui_con_horzintal, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_con_vertical.getParent().getLayout()).setInsets(gui_con_vertical, "0.0mm 0.0mm 0.0mm 0.0mm").setReferenceComponents(gui_con_vertical, "0 -1 -1 0 ").setReferencePositions(gui_con_vertical, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredWidthMM((float)72.825356);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredHeightMM((float)14.94718);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getParent().getLayout()).setInsets(gui_Container, "0.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_Container, "-1 -1 -1 -1").setReferencePositions(gui_Container, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_1.getParent().getLayout()).setInsets(gui_Container_1, "0.0mm 0.0mm 0.0mm 0.0mm").setReferenceComponents(gui_Container_1, "0 -1 -1 -1").setReferencePositions(gui_Container_1, "1.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    private void installFixItems() {
        CheckBox box = new CheckBox();
//        box.
    }

    private void installContainer() {
        for (int i = 0; i < 10; i++) {
            gui_con_horzintal.add(new client_home_con_horzintal(res));
        }
    }
}
