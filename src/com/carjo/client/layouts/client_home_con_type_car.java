package com.carjo.client.layouts;

import com.cn2.ui.cn1Icons;

public class client_home_con_type_car extends com.codename1.ui.Container {

    public client_home_con_type_car() {
        this(com.codename1.ui.util.Resources.getGlobalResources());

    }

    public client_home_con_type_car(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
        /// ...
    }
    String type_car;

    public client_home_con_type_car(com.codename1.ui.util.Resources res, String name, boolean isCheck) {
        initGuiBuilderComponents(res);
        type_car = name.toLowerCase();
        gui_img.setPreferredW(100);
        gui_img.setPreferredH(100);
        gui_lbl_type.setPreferredH(100);
        gui_lbl_type.setText(name);
        if (!name.equalsIgnoreCase("all")) {
            gui_img.getAllStyles().setBgImage(res.getImage("ic_" + type_car + ".png"));
        } else {
            gui_img.setVisible(false);
        }
        gui_lbl_check.setIcon(new cn1Icons().getImage("check box outline blank", "SideCommand", 4));

        if (isCheck) {
            gui_lbl_check.setIcon(new cn1Icons().getImage("check box", "SideCommand", 4));
        } else {
            gui_lbl_check.setIcon(new cn1Icons().getImage("check box outline blank", "SideCommand", 4));
        }

        gui_btn_select.addActionListener(e -> {
            type_car = gui_lbl_type.getText().toLowerCase();
            if (type_car.equals("sedan")) {
                if (client_home_con_type_car_controller.sedan) {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box outline blank", "SideCommand", 4));
                    client_home_con_type_car_controller.sedan = false;
                } else {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box", "SideCommand", 4));
                    client_home_con_type_car_controller.sedan = true;
                }
            } else if (type_car.equals("coupe")) {
                if (client_home_con_type_car_controller.coupe) {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box outline blank", "SideCommand", 4));
                    client_home_con_type_car_controller.coupe = false;
                } else {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box", "SideCommand", 4));
                    client_home_con_type_car_controller.coupe = true;
                }
            } else if (type_car.equals("convertible")) {
                if (client_home_con_type_car_controller.convertible) {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box outline blank", "SideCommand", 4));
                    client_home_con_type_car_controller.convertible = false;
                } else {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box", "SideCommand", 4));
                    client_home_con_type_car_controller.convertible = true;
                }
            } else if (type_car.equals("suv")) {
                if (client_home_con_type_car_controller.suv) {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box outline blank", "SideCommand", 4));
                    client_home_con_type_car_controller.suv = false;
                } else {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box", "SideCommand", 4));
                    client_home_con_type_car_controller.suv = true;
                }
            } else if (type_car.equals("hatchback")) {
                if (client_home_con_type_car_controller.hatchback) {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box outline blank", "SideCommand", 4));
                    client_home_con_type_car_controller.hatchback = false;
                } else {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box", "SideCommand", 4));
                    client_home_con_type_car_controller.hatchback = true;
                }
            } else if (type_car.equals("van")) {
                if (client_home_con_type_car_controller.van) {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box outline blank", "SideCommand", 4));
                    client_home_con_type_car_controller.van = false;
                } else {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box", "SideCommand", 4));
                    client_home_con_type_car_controller.van = true;
                }
            } else if (type_car.equals("all cars")) {
                if (client_home_con_type_car_controller.all) {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box outline blank", "SideCommand", 4));
                    client_home_con_type_car_controller.all = false;
                } else {
                    gui_lbl_check.setIcon(new cn1Icons().getImage("check box", "SideCommand", 4));
                    client_home_con_type_car_controller.all = true;
                    // should set true for all
                }
            }
        });

    }

//////////////////////////////-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Container gui_Container_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.Container gui_Container = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.Label gui_img = new com.codename1.ui.Label();
    protected com.codename1.ui.Label gui_lbl_type = new com.codename1.ui.Label();
    protected com.codename1.ui.Button gui_btn_select = new com.codename1.ui.Button();
    protected com.codename1.ui.Label gui_lbl_check = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
                setInlineStylesTheme(resourceObjectInstance);
        setName("client_home_con_type_car");
        gui_Container_1.setPreferredSizeStr("50.0mm 8.994709mm");
                gui_Container_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Container_1.setName("Container_1");
        addComponent(gui_Container_1);
        gui_Container.setPreferredSizeStr("66.93122mm 9.78836mm");
                gui_Container.setInlineStylesTheme(resourceObjectInstance);
        gui_Container.setInlineAllStyles("bgImage:null;");
        gui_Container.setName("Container");
        gui_btn_select.setPreferredSizeStr("53.968254mm 15.079365mm");
        gui_btn_select.setUIID("transperent");
                gui_btn_select.setInlineStylesTheme(resourceObjectInstance);
        gui_btn_select.setName("btn_select");
        gui_lbl_check.setPreferredSizeStr("10.05291mm 8.994709mm");
        gui_lbl_check.setText("");
                gui_lbl_check.setInlineStylesTheme(resourceObjectInstance);
        gui_lbl_check.setName("lbl_check");
        gui_Container_1.addComponent(gui_Container);
        gui_img.setPreferredSizeStr("10.58201mm 9.78836mm");
        gui_img.setText("");
                gui_img.setInlineStylesTheme(resourceObjectInstance);
        gui_img.setInlineAllStyles("bgImage:ic_coupe.png;");
        gui_img.setName("img");
        gui_lbl_type.setPreferredSizeStr("27.248678mm 7.4074073mm");
        gui_lbl_type.setText("Compact");
        gui_lbl_type.setUIID("PersonalInfo_Lbl_AR");
                gui_lbl_type.setInlineStylesTheme(resourceObjectInstance);
        gui_lbl_type.setName("lbl_type");
        gui_Container.addComponent(gui_img);
        gui_Container.addComponent(gui_lbl_type);
        ((com.codename1.ui.layouts.LayeredLayout)gui_img.getParent().getLayout()).setInsets(gui_img, "auto 0.0mm auto auto").setReferenceComponents(gui_img, "-1 -1 -1 -1").setReferencePositions(gui_img, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_lbl_type.getParent().getLayout()).setInsets(gui_lbl_type, "auto 0.0mm auto -4.7683716E-7mm").setReferenceComponents(gui_lbl_type, "-1 0 -1 -1").setReferencePositions(gui_lbl_type, "0.0 1.0 0.0 0.0");
        gui_Container_1.addComponent(gui_btn_select);
        gui_Container_1.addComponent(gui_lbl_check);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredWidthMM((float)89.41799);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredHeightMM((float)9.78836);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getParent().getLayout()).setInsets(gui_Container, "auto 0.0mm auto 7.936508mm").setReferenceComponents(gui_Container, "-1 -1 -1 -1").setReferencePositions(gui_Container, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_btn_select.getParent().getLayout()).setInsets(gui_btn_select, "0.0mm 0.0mm 0.0mm 0.0mm").setReferenceComponents(gui_btn_select, "-1 -1 -1 -1").setReferencePositions(gui_btn_select, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_lbl_check.getParent().getLayout()).setInsets(gui_lbl_check, "0.0mm auto auto -5.9604645E-8mm").setReferenceComponents(gui_lbl_check, "-1 -1 -1 -1").setReferencePositions(gui_lbl_check, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_1.getLayout()).setPreferredWidthMM((float)50.0);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_1.getLayout()).setPreferredHeightMM((float)9.259259);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_1.getParent().getLayout()).setInsets(gui_Container_1, "auto auto auto auto").setReferenceComponents(gui_Container_1, "-1 -1 -1 -1").setReferencePositions(gui_Container_1, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
