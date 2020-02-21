package com.carjo.client.forms;

import com.carjo.client.layouts.logo;
import com.carjo.login.login_form;
import com.cn2.lang.cn1Math;
import com.cn2.ui.cn1Display;
import com.cn2.ui.cn1Icons;
import com.codename1.components.ToastBar;
import com.codename1.io.Preferences;
import com.codename1.location.Location;
import com.codename1.location.LocationManager;
import com.codename1.maps.Coord;
import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.Component;
import static com.codename1.ui.Component.CENTER;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.util.Resources;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class cBaseForm extends Form {

    int length = cn1Math.nextDown(getToolbar().getPreferredH() / 3.0);
    private Form cerruntForm = null;
    private static List<Map<String, Object>> list = null;
    private static String[] gyms_names;
    private static String[] gyms_coordinates;

    public static String[] getGymsNames() {
        return gyms_names;
    }

    public static String[] getGymsCoord() {
        return gyms_coordinates;
    }

    public static List<Map<String, Object>> getList() {
        return list;
    }

    public void setList(List<Map<String, Object>> list) {
        this.list = list;
        int size = list.size();
        gyms_names = new String[size];
        gyms_coordinates = new String[size];
        if (list != null) {
            for (int i = 0; i < size; i++) {
                Map<String, Object> item = list.get(i);
//                String id_gym = item.get("id") + "";
                gyms_names[i] = item.get("name") + "";
                gyms_coordinates[i] = item.get("coordinates") + "";
            }
        }

    }

    public Form getCerruntForm() {
        return cerruntForm;
    }

    public void setCerruntForm(Form cerruntForm) {
        this.cerruntForm = cerruntForm;
    }

    public void installTitleArea(Resources res) {
        this.setTitle("");
        this.setScrollVisible(false);
//        System.out.println("cn1Display.getHeight()/9:" + cn1Display.getHeight() / 9);
        getToolbar().setPreferredH(Math.max(150, cn1Display.getHeight() / 9));
        this.getToolbar().add(CENTER, new logo(res));
        Button help = new Button();
        help.getAllStyles().setBgImage(new cn1Icons().getImage("help outline", "TitleCommand", 6));
        help.setPreferredH(50);
        help.setPreferredW(100);
        help.addActionListener(e -> {
            Dialog d = new Dialog();
            d.setLayout(BoxLayout.y());
            d.showPopupDialog(help);
        });
        this.getToolbar().add(RIGHT, help);
    }

    public void installBackIcon(Form backform) {
        this.getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK_IOS, e -> {
            backform.show();
        });
    }

    public void installBackCommand(Form backform) {
        Command back = new Command("Back") {
            public void actionPerformed(ActionEvent ev) {
                backform.show();
            }
        };
        this.setBackCommand(back);
    }

    public void installOrderIcon(Resources res, ActionListener e) {
        Button orders = new Button("");
        orders.getAllStyles().setBgImage(res.getImage("orders.png").scaled(length, length));
//        orders.getAllStyles().setMarginTop(2);
//        orders.getAllStyles().setMarginBottom(2);
//        orders.getAllStyles().setMarginRight(0);
//System.out.println(    getToolbar().getComponentAt(2).getUIID());
//        for (int i = 0; i < getToolbar().getComponentCount(); i++) {
//            System.out.println(getToolbar().getComponentAt(i).getUIID());
//        }
//        System.out.println(((Container)getToolbar().getComponentAt(1)).getComponentAt(1).getUIID());

//        System.out.println(getToolbar().getComponentat);
//        System.out.println(getToolbar().getComponentForm().getComponentCount());
        orders.setPreferredW(length);
        orders.addActionListener(e);
        this.getToolbar().addComponent(BorderLayout.EAST, orders);
    }

    public void installMessangerIcon(Resources res, ActionListener e) {
        Button orders = new Button("");
        orders.getAllStyles().setBgImage(res.getImage("messengerr.png").scaled(length, length));
        orders.setPreferredW(length);
        orders.addActionListener(e);
        this.getToolbar().addComponent(BorderLayout.EAST, orders);
    }

    public void installSideMenu(Resources res, Form frm) {
        Label l = new Label("");
        l.setIcon(res.getImage("greet.png"));
        l.setPreferredH(cn1Display.getScaledMax(10));
        l.setPreferredW(250);
        this.getToolbar().addComponentToLeftSideMenu(FlowLayout.encloseCenter(l));
        this.getToolbar().addCommandToLeftSideMenu("   Cars", new cn1Icons().getImage("directions car", "SideCommand", 6), e -> {
            new client_home(res).show();
        });
        this.getToolbar().addComponentToLeftSideMenu(createDivider(0xececec));
        this.getToolbar().addCommandToLeftSideMenu("   Favorites", new cn1Icons().getImage("favorite", "SideCommand", 6), e -> {
//            if (cerruntForm != null) {
//                cerruntForm.show();
//            } else {
//                System.out.println("null form from side menu");
//                Form map = new map_form(res, frm);
//                setCerruntForm(map);
//                map.show();
//            }
//            new map_form(res, new list_form(res)).show();
        });
        this.getToolbar().addComponentToLeftSideMenu(createDivider(0xececec));
        this.getToolbar().addCommandToLeftSideMenu("   Orders", new cn1Icons().getImage("business center", "SideCommand", 6), e -> {
//            new user_orders(res, frm).show();
//            new client_orders(res, frm).show();
        });
        this.getToolbar().addComponentToLeftSideMenu(createDivider(0xececec));
        this.getToolbar().addCommandToLeftSideMenu("   Personal Information", new cn1Icons().getImage("person", "SideCommand", 6), e -> {
//            new user_info(res, frm).show();
        });

        this.getToolbar().addComponentToLeftSideMenu(createDivider(0xececec));
        this.getToolbar().addCommandToLeftSideMenu("   Logout", new cn1Icons().getImage("exit to app", "SideCommand", 6), e -> {
            Preferences.clearAll();
            new login_form(res).show();
        });
        this.getToolbar().addComponentToLeftSideMenu(createDivider(0xececec));

        Image img = FontImage.createMaterial(FontImage.MATERIAL_MENU, "transperent", 5);
    }
    int is = 0;

    public Coord getDeviceCoord() {
        Location location = LocationManager.getLocationManager().getLastKnownLocation();
        if (location == null) {
            try {
                location = LocationManager.getLocationManager().getCurrentLocation();
            } catch (IOException err) {
                ToastBar.showErrorMessage("erorr: " + is);
                is++;
                getDeviceCoord();
            }
        }
        Double lat = location.getLatitude();
        Double lng = location.getLongitude();
        return new Coord(lat, lng);
    }

    public Label createDivider(int color) {
        Label divider = new Label("", "dividerSideMenu");
        divider.setPreferredH(10);
        divider.setPreferredW(cn1Display.getWidth());
        divider.getAllStyles().setBgColor(color);
        return divider;
    }


//    private void facebookLogout(Resources res) {
//        String clientId = "477873012799140";
//        String redirectURI = "https://yallagym.com/";
//        String clientSecret = "62a40334c51182c38745ef8040e75227";
//        com.codename1.social.Login fb = FacebookConnect.getInstance();
//        fb.setClientId(clientId);
//        fb.setRedirectURI(redirectURI);
//        fb.setClientSecret(clientSecret);
//        fb.setScope("email");
//        fb.doLogout();
//        Preferences.set("token", "");
//        new Login(res).show();
//    }

    public TextField createSearchBar(Resources res, Container con_search) {
        TextField search = new TextField("", "  Search Here...");
        search.setUIID("Activation_Input");
        search.setHintIcon(res.getImage("search_ic.png").scaled(56, 56));
        search.getHintLabel().setUIID("TextHintLarge");
        con_search.setUIID("search_input");
        con_search.add(CENTER, search);
        return search;
    }

    public boolean checkIfThereChars(String textField) {
        boolean bool = textField.contains("'") || textField.contains("\"") || textField.contains("\\") || textField.contains("/") || textField.contains(".") || textField.contains("@");
        return bool;
    }

    public Component getComponent(Form frm, int... index) {
        Container cmb = (Container) frm.getComponentAt(index[0]);
        for (int i : index) {
            Container Container1 = (Container) cmb.getComponentAt(i);
            cmb = Container1;
        }
        return cmb;
    }

    public boolean isAndroid() {
        return Display.getInstance().getProperty("OS", "").equals("android");
    }

}
