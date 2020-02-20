 package com.carjo.dialogs;  

import com.codename1.ui.events.ActionListener;

public class dlg_2_option extends com.codename1.ui.Dialog {

    public dlg_2_option() {
        this(com.codename1.ui.util.Resources.getGlobalResources());

    }

    public dlg_2_option(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
        /// ...
    }

    public dlg_2_option(com.codename1.ui.util.Resources res, String title, String msg, String yes, ActionListener yes_a) {
        initGuiBuilderComponents(res);
        this.setScrollable(false);
        this.setScrollVisible(false);
        gui_Title.setText(title);
        gui_Msg.setText(msg);
        gui_Yes.setText(yes);
        gui_Yes.addActionListener(e -> dispose());
        gui_Yes.addActionListener(yes_a);
        this.setDialogUIID("transperent");
        this.setTitle("");
        this.setDisposeWhenPointerOutOfBounds(true);
        this.setMinimizeOnBack(true);
        this.setBlurBackgroundRadius(15);
        gui_No.addActionListener(e -> {
            this.dispose();
        });
    }

    public dlg_2_option(com.codename1.ui.util.Resources res, String title, String msg, String yes, ActionListener yes_a, String no, ActionListener no_a) {
        initGuiBuilderComponents(res);
        this.setScrollable(false);
        this.setScrollVisible(false);
        gui_Title.setText(title);
        gui_Msg.setText(msg);
        gui_Yes.setText(yes);
        gui_No.setText(no);
        gui_Yes.addActionListener(e -> dispose());
        gui_Yes.addActionListener(yes_a);
        gui_No.addActionListener(e -> dispose());
        gui_No.addActionListener(no_a);
        this.setDialogUIID("transperent");
        this.setTitle("");
        this.setDisposeWhenPointerOutOfBounds(true);
        this.setMinimizeOnBack(true);
        this.setBlurBackgroundRadius(15);

    }
//////-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Container gui_Container = new com.codename1.ui.Container(new com.codename1.ui.layouts.LayeredLayout());
    protected com.codename1.ui.Button gui_No = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_Yes = new com.codename1.ui.Button();
    protected com.codename1.ui.Label gui_Title = new com.codename1.ui.Label();
    protected com.codename1.ui.TextArea gui_Msg = new com.codename1.ui.TextArea();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("dlg_2_option");
        setName("dlg_2_option");
        gui_Container.setPreferredSizeStr("59.78836mm 40.476192mm");
        gui_Container.setUIID("Dialog_ContantPane");
                gui_Container.setInlineStylesTheme(resourceObjectInstance);
        gui_Container.setName("Container");
        addComponent(gui_Container);
        gui_No.setPreferredSizeStr("16.137566mm 8.465609mm");
        gui_No.setText("No");
        gui_No.setUIID("Dialog_Btn");
                gui_No.setInlineStylesTheme(resourceObjectInstance);
        gui_No.setName("No");
        gui_Yes.setPreferredSizeStr("15.343915mm 8.465609mm");
        gui_Yes.setText("Yes");
        gui_Yes.setUIID("Dialog_Btn");
                gui_Yes.setInlineStylesTheme(resourceObjectInstance);
        gui_Yes.setName("Yes");
        gui_Title.setPreferredSizeStr("55.291004mm 6.878307mm");
        gui_Title.setUIID("Dialog_Title");
                gui_Title.setInlineStylesTheme(resourceObjectInstance);
        gui_Title.setName("Title");
        gui_Msg.setPreferredSizeStr("54.232803mm 6.6137567mm");
        gui_Msg.setEditable(false);
        gui_Msg.setUIID("Dialog_Msg");
                gui_Msg.setInlineStylesTheme(resourceObjectInstance);
        gui_Msg.setName("Msg");
        gui_Msg.setColumns(8);
        gui_Container.addComponent(gui_No);
        gui_Container.addComponent(gui_Yes);
        gui_Container.addComponent(gui_Title);
        gui_Container.addComponent(gui_Msg);
        ((com.codename1.ui.layouts.LayeredLayout)gui_No.getParent().getLayout()).setInsets(gui_No, "auto 2.3809524mm 0.0mm 2.3809524mm").setReferenceComponents(gui_No, "-1 -1 -1 1 ").setReferencePositions(gui_No, "0.0 0.0 0.0 1.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Yes.getParent().getLayout()).setInsets(gui_Yes, "auto 54.181816% 0.0mm 2.3809524mm").setReferenceComponents(gui_Yes, "-1 -1 -1 -1").setReferencePositions(gui_Yes, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Title.getParent().getLayout()).setInsets(gui_Title, "0.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_Title, "-1 -1 -1 -1").setReferencePositions(gui_Title, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Msg.getParent().getLayout()).setInsets(gui_Msg, "-3.5762787E-7mm 0.0mm 1.7881393E-7mm 0.0mm").setReferenceComponents(gui_Msg, "2 -1 1 -1").setReferencePositions(gui_Msg, "1.0 0.0 1.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredWidthMM((float)55.291004);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getLayout()).setPreferredHeightMM((float)40.476192);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Container.getParent().getLayout()).setInsets(gui_Container, "auto 0.0mm auto 0.0mm").setReferenceComponents(gui_Container, "-1 -1 -1 -1").setReferencePositions(gui_Container, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
