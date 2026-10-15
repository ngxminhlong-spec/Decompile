package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import o1.InterfaceC1859e0;
import o1.ViewOnClickListenerC1857d0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ToolbarContainer extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1859e0 f3767o;

    /* renamed from: p, reason: collision with root package name */
    public Control f3768p;

    /* renamed from: q, reason: collision with root package name */
    public Control f3769q;

    /* renamed from: r, reason: collision with root package name */
    public Control f3770r;

    /* renamed from: s, reason: collision with root package name */
    public Control f3771s;

    public ToolbarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3768p = (Control) findViewById(R.id.undo);
        this.f3769q = (Control) findViewById(R.id.redo);
        this.f3770r = (Control) findViewById(R.id.save);
        this.f3771s = (Control) findViewById(R.id.settings);
        this.f3770r.setOnClickListener(new ViewOnClickListenerC1857d0(this, 0));
        this.f3768p.setOnClickListener(new ViewOnClickListenerC1857d0(this, 1));
        this.f3769q.setOnClickListener(new ViewOnClickListenerC1857d0(this, 2));
        this.f3771s.setOnClickListener(new ViewOnClickListenerC1857d0(this, 3));
        findViewById(R.id.back_arrow).setOnClickListener(new ViewOnClickListenerC1857d0(this, 4));
    }

    public void setInterface(InterfaceC1859e0 interfaceC1859e0) {
        this.f3767o = interfaceC1859e0;
    }

    public void setRedoEnabled(boolean z4) {
        Control control = this.f3769q;
        if (control.f3606x != z4) {
            control.f3606x = z4;
            control.a();
        }
    }

    public void setSavingEnabled(boolean z4) {
        Control control = this.f3770r;
        if (control.f3606x != z4) {
            control.f3606x = z4;
            control.a();
        }
    }

    public void setSettingsEnabled(boolean z4) {
        this.f3771s.setEnabled(z4);
    }

    public void setUndoEnabled(boolean z4) {
        Control control = this.f3768p;
        if (control.f3606x != z4) {
            control.f3606x = z4;
            control.a();
        }
    }
}
