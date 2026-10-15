package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import o1.InterfaceC1858e;
import o1.ViewOnClickListenerC1856d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ColorPicker extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1858e f3594o;

    /* renamed from: p, reason: collision with root package name */
    public int f3595p;

    public ColorPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.color1_container).setOnClickListener(new ViewOnClickListenerC1856d(this, 0));
        findViewById(R.id.color2_container).setOnClickListener(new ViewOnClickListenerC1856d(this, 1));
        findViewById(R.id.color3_container).setOnClickListener(new ViewOnClickListenerC1856d(this, 2));
        findViewById(R.id.color4_container).setOnClickListener(new ViewOnClickListenerC1856d(this, 3));
        findViewById(R.id.color5_container).setOnClickListener(new ViewOnClickListenerC1856d(this, 4));
        findViewById(R.id.color6_container).setOnClickListener(new ViewOnClickListenerC1856d(this, 5));
        setSelectedColor(this.f3595p);
    }

    public void setListener(InterfaceC1858e interfaceC1858e) {
        this.f3594o = interfaceC1858e;
    }

    public void setSelectedColor(int i4) {
        this.f3595p = i4;
        if (findViewById(R.id.color1_container) == null) {
            return;
        }
        findViewById(R.id.color1_container).setSelected(false);
        findViewById(R.id.color2_container).setSelected(false);
        findViewById(R.id.color3_container).setSelected(false);
        findViewById(R.id.color4_container).setSelected(false);
        findViewById(R.id.color5_container).setSelected(false);
        findViewById(R.id.color6_container).setSelected(false);
        if (i4 == getResources().getColor(R.color.accent_1)) {
            findViewById(R.id.color1_container).setSelected(true);
        }
        if (i4 == getResources().getColor(R.color.accent_2)) {
            findViewById(R.id.color2_container).setSelected(true);
        }
        if (i4 == getResources().getColor(R.color.accent_3)) {
            findViewById(R.id.color3_container).setSelected(true);
        }
        if (i4 == getResources().getColor(R.color.accent_4)) {
            findViewById(R.id.color4_container).setSelected(true);
        }
        if (i4 == getResources().getColor(R.color.accent_5)) {
            findViewById(R.id.color5_container).setSelected(true);
        }
        if (i4 == getResources().getColor(R.color.accent_6)) {
            findViewById(R.id.color6_container).setSelected(true);
        }
    }
}
