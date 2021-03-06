 package com.carjo.client.forms;  

import com.carjo.client.CLIENT_API;
import com.carjo.login.BaseLogin;
import com.cn2.io.cn1ConnectionRequest;
import com.cn2.ui.cn1Display;
import com.codename1.components.InfiniteProgress;
import com.codename1.components.ToastBar;
import static com.codename1.ui.Component.CENTER;
import com.codename1.ui.Dialog;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.TextField;
import com.codename1.ui.util.Resources;
import java.util.Random;

public class client_forget extends BaseLogin {
  
    Resources res;
    TextField user;
    Form frm;
    String verificationValue;
    private int codeDigits = 4;
    String accountSID = "AC8a05dfed89952abee829f1d70357c9b1";
    String authToken = "4743053c294d2ee04c57d87181446d41";
    String fromPhone = "+19123861560";
    Form current;
    CLIENT_API api = new CLIENT_API();

    public client_forget() {
        this(com.codename1.ui.util.Resources.getGlobalResources());

    }

    public client_forget(com.codename1.ui.util.Resources res) {
        initGuiBuilderComponents(res);

    }

    public client_forget(com.codename1.ui.util.Resources res, Form frm, String username) {
        initGuiBuilderComponents(res);
        this.res = res;
        this.frm = frm;
        current = this;
//        installBackCommand(frm);
        installFixItems();
        if (!username.equals("")) {
            user.setText(username);
        }
    }

////////////////////////////////////////////////////////////////////-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Container gui_Container = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.Label gui_bg_img = new com.codename1.ui.Label();
    protected com.codename1.ui.Label gui_bg_img_gray = new com.codename1.ui.Label();
    protected com.codename1.ui.Label gui_lbl_logo = new com.codename1.ui.Label();
    protected com.codename1.ui.Container gui_Container_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.Container gui_Container_2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.components.SpanLabel gui_sb_msg = new com.codename1.components.SpanLabel();
    protected com.codename1.ui.Button gui_btn_continue = new com.codename1.ui.Button();
    protected com.codename1.ui.Container gui_con_user = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    protected com.codename1.ui.Button gui_btn_back = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_btn_continue.addActionListener(callback);
        gui_btn_back.addActionListener(callback);
    }

    class EventCallbackClass implements com.codename1.ui.events.ActionListener, com.codename1.ui.events.DataChangedListener {
        private com.codename1.ui.Component cmp;
        public EventCallbackClass(com.codename1.ui.Component cmp) {
            this.cmp = cmp;
        }

        public EventCallbackClass() {
        }

        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
            com.codename1.ui.Component sourceComponent = ev.getComponent();

            if(sourceComponent.getParent().getLeadParent() != null && (sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.MultiButton || sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.SpanButton)) {
                sourceComponent = sourceComponent.getParent().getLeadParent();
            }

            if(sourceComponent == gui_btn_continue) {
                onbtn_continueActionEvent(ev);
            }
            if(sourceComponent == gui_btn_back) {
                onbtn_backActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("client_forget");
        setName("client_forget");
        gui_Container.setPreferredSizeStr("inherit 116.666664mm");
                gui_Container.setInlineStylesTheme(resourceObjectInstance);
        gui_Container.setName("Container");
        addComponent(gui_Container);
                gui_bg_img.setInlineStylesTheme(resourceObjectInstance);
        gui_bg_img.setInlineAllStyles("bgImage:background-image.png;");
        gui_bg_img.setName("bg_img");
        gui_bg_img_gray.setPreferredSizeStr("123.544975mm 138.62434mm");
                gui_bg_img_gray.setInlineStylesTheme(resourceObjectInstance);
        gui_bg_img_gray.setInlineAllStyles("bgImage:dark-layer.png;");
        gui_bg_img_gray.setName("bg_img_gray");
        gui_lbl_logo.setPreferredSizeStr("28.042328mm 23.809525mm");
                gui_lbl_logo.setInlineStylesTheme(resourceObjectInstance);
        gui_lbl_logo.setInlineAllStyles("bgImage:logo.png;");
        gui_lbl_logo.setName("lbl_logo");
        gui_Container_1.setPreferredSizeStr("58.46561mm 100.5291mm");
                gui_Container_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Container_1.setName("Container_1");
        gui_btn_back.setPreferredSizeStr("10.8465605mm 8.465609mm");
        gui_btn_back.setUIID("login_btn");
                gui_btn_back.setInlineStylesTheme(resourceObjectInstance);
        gui_btn_back.setName("btn_back");
        com.codename1.ui.FontImage.setMaterialIcon(gui_btn_back,"\ue5c4".charAt(0));
        gui_Container.addComponent(gui_bg_img);
        gui_Container.addComponent(gui_bg_img_gray);
        gui_Container.addComponent(gui_lbl_logo);
        gui_Container.addComponent(gui_Container_1);
        gui_Container_2.setPreferredSizeStr("77.24868mm 12.1693125mm");
                gui_Container_2.setInlineStylesTheme(resourceObjectInstance);
        gui_Container_2.setName("Container_2");
        gui_btn_continue.setPreferredSizeStr("57.67196mm 7.6719575mm");
        gui_btn_continue.setText("CONTINUE");
        gui_btn_continue.setUIID("button1");
                gui_btn_continue.setInlineStylesTheme(resourceObjectInstance);
        gui_btn_continue.setInlineAllStyles("bgImage:;");
        gui_btn_continue.setName("btn_continue");
        gui_con_user.setPreferredSizeStr("74.07407mm 8.994709mm");
        gui_con_user.setUIID("con_input");
                gui_con_user.setInlineStylesTheme(resourceObjectInstance);
        gui_con_user.setName("con_user");
        gui_Label.setPreferredSizeStr("35.185184mm 7.4074073mm");
        gui_Label.setText("Forget password");
        gui_Label.setUIID("lbl_white");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setName("Label");
        gui_Container_1.addComponent(gui_Container_2);
        gui_sb_msg.setPreferredSizeStr("55.555557mm 11.640212mm");
        gui_sb_msg.setText("Enter email or phone ,we will send you a code that can use to login");
                gui_sb_msg.setInlineStylesTheme(resourceObjectInstance);
        gui_sb_msg.setName("sb_msg");
        gui_sb_msg.setPropertyValue("textUiid", "sb_center_white");
        gui_Container_2.addComponent(gui_sb_msg);
        ((com.codename1.ui.layouts.LayeredLayout)gui_sb_msg.getParent().getLayout()).setInsets(gui_sb_msg, "0.0mm 0.0mm 0.0mm 0.0mm").setReferenceComponents(gui_sb_msg, "-1 -1 -1 -1").setReferencePositions(gui_sb_msg, "0.0 0.0 0.0 0.0");
        gui_Container_1.addComponent(gui_btn_continue);
        gui_Container_1.addComponent(gui_con_user);
        gui_Container_1.addComponent(gui_Label);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_2.getLayout()).setPreferredWidthMM((float)77.24868);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_2.getLayout()).setPreferredHeightMM((float)12.1693125);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_2.getParent().getLayout()).setInsets(gui_Container_2, "0.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_Container_2, "3 -1 -1 -1").setReferencePositions(gui_Container_2, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_btn_continue.getParent().getLayout()).setInsets(gui_btn_continue, "3.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_btn_continue, "2 -1 -1 -1").setReferencePositions(gui_btn_continue, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_con_user.getLayout()).setPreferredWidthMM((float)59.25926);
        ((com.codename1.ui.layouts.LayeredLayout)gui_con_user.getLayout()).setPreferredHeightMM((float)8.994709);
        ((com.codename1.ui.layouts.LayeredLayout)gui_con_user.getParent().getLayout()).setInsets(gui_con_user, "2.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_con_user, "0 -1 -1 -1").setReferencePositions(gui_con_user, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label.getParent().getLayout()).setInsets(gui_Label, "2.0mm auto auto auto").setReferenceComponents(gui_Label, "-1 -1 -1 -1").setReferencePositions(gui_Label, "0.0 0.0 0.0 0.0");
        gui_Container.addComponent(gui_btn_back);
        ((com.codename1.ui.layouts.LayeredLayout)gui_bg_img.getParent().getLayout()).setInsets(gui_bg_img, "0.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_bg_img, "-1 -1 -1 -1").setReferencePositions(gui_bg_img, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_bg_img_gray.getParent().getLayout()).setInsets(gui_bg_img_gray, "0.0mm 0.0mm 0.0mm 0.0mm").setReferenceComponents(gui_bg_img_gray, "-1 -1 -1 -1").setReferencePositions(gui_bg_img_gray, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_lbl_logo.getParent().getLayout()).setInsets(gui_lbl_logo, "5.0mm auto auto auto").setReferenceComponents(gui_lbl_logo, "-1 -1 -1 -1").setReferencePositions(gui_lbl_logo, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_1.getLayout()).setPreferredWidthMM((float)58.46561);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_1.getLayout()).setPreferredHeightMM((float)100.5291);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container_1.getParent().getLayout()).setInsets(gui_Container_1, "2.0mm 2.6455026mm 0.0mm 3.7037039mm").setReferenceComponents(gui_Container_1, "2 -1 -1 -1").setReferencePositions(gui_Container_1, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_btn_back.getParent().getLayout()).setInsets(gui_btn_back, "0.0mm auto auto 0.0mm").setReferenceComponents(gui_btn_back, "-1 -1 -1 -1").setReferencePositions(gui_btn_back, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredWidthMM((float)69.04762);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredHeightMM((float)116.666664);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getParent().getLayout()).setInsets(gui_Container, "0.0mm 0.0mm 0.0mm 0.0mm").setReferenceComponents(gui_Container, "-1 -1 -1 -1").setReferencePositions(gui_Container, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!INE!!!
    public void onbtn_continueActionEvent(com.codename1.ui.events.ActionEvent ev) {
        String username = user.getText();
//        if (StringUtil.replaceAll(username, " ", "").length() > 0) {
//            Random r = new Random();
//            String code = "";
//            for (int iter = 0; iter < codeDigits; iter++) {
//                code += r.nextInt(10);
//            }
//            verificationValue = code;
        if (isPhone(username)) {
            sendPhone(username);
        } else {
            sendUsername(username);
        }
//        } else {
//            ToastBar.showInfoMessage("Please enter username or phone");
//        }

    }

    public void onbtn_backActionEvent(com.codename1.ui.events.ActionEvent ev) {
        frm.show();
    }

    public TextField createTextField(String hint, Image hint_icon) {
        TextField tf = new TextField("", "    " + hint);
        tf.setUIID("Activation_Input");
        tf.setScrollVisible(false);
        tf.getHintLabel().setIcon(hint_icon);
        tf.getHintLabel().getAllStyles().setPaddingLeft(2.5f);
        tf.setRows(1);
        tf.setSmoothScrolling(false);
        return tf;
    }

    private void installFixItems() {
        getToolbar().setHidden(true);
        setScrollVisible(false);
        gui_lbl_logo.setPreferredH(gui_lbl_logo.getPreferredW());
        user = createTextField("Username or Phone", res.getImage("mail_ic.png").scaled(56, 56));
        gui_con_user.add(CENTER, user);
        gui_Container.setPreferredH(cn1Display.getHeight());
        gui_sb_msg.setText("Enter username or phone, we will send you a code that can use to login");
    }
    Dialog ipDlg;

    private void sendPhone(String username) {
        InfiniteProgress ip = new InfiniteProgress();
        ipDlg = ip.showInifiniteBlocking();
        String phone = formatUser(username);
        System.out.println("phone:" + phone);
        String request = api.isUser(phone);
        System.out.println("request:"+request);
        if (!request.equals("0")) {
            Random r = new Random();
            String val = "";
            for (int iter = 0; iter < codeDigits; iter++) {
                val += r.nextInt(10);
            }
            sendSmsAsync(phone, val);

        } else {
            ipDlg.dispose();
            ToastBar.showErrorMessage("This phone does not found", 4000);
        }

    }

    private void sendUsername(String username) {
        InfiniteProgress ip = new InfiniteProgress();
        ipDlg = ip.showInifiniteBlocking();
        String Username = formatUser(username);
        String phone = api.isUser(Username);
        Random r = new Random();
        String val = "";
        for (int iter = 0; iter < codeDigits; iter++) {
            val += r.nextInt(10);
        }
              System.out.println("request:"+phone);
        if (!phone.equals("0")) {
            sendSmsAsync(phone, val);
        } else {
            ipDlg.dispose();
            ToastBar.showErrorMessage("This username does not found", 4000);
        }
    }

    public void sendSmsAsync(String phone, String code) {
        ipDlg.dispose();
        cn1ConnectionRequest.sendReleansSMS(phone, "Your Verfication code is:" + code, "Pr1gO3GWpmbkRZEazJn4KRjLM", "eaecb9656afbd9db955b22a49d78f5e5a582d2778d55ee09a448a3aa8f7a8f90");
//        new activition_form_2(res, current, phone, code).show(); *********
    }

//    private void sendEmail(String email) {
//        InfiniteProgress ip = new InfiniteProgress();
//        final Dialog ipDlg = ip.showInifiniteBlocking();
//        String request = api.sendCode(email, verificationValue);
//        ipDlg.dispose();
//        switch (request) {
//            case "username not found":
//                ToastBar.showErrorMessage("This email does not found ", 4000);
//                break;
//            case "true":
//                new activition_form_2(res, current, formatUser(email), verificationValue).show();
//                break;
//            case "false":
//                ToastBar.showErrorMessage("Error sending to this email, try use phone number", 4000);
//                break;
//
//        }
//    }
}