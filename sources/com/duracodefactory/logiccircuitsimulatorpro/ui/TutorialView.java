package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;
import o1.C1841Q;
import o1.InterfaceC1865h0;
import o1.ViewOnClickListenerC1863g0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class TutorialView extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public ViewGroup f3773o;

    /* renamed from: p, reason: collision with root package name */
    public View f3774p;

    /* renamed from: q, reason: collision with root package name */
    public View f3775q;

    /* renamed from: r, reason: collision with root package name */
    public int f3776r;

    public TutorialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private ArrayList<C1841Q> getStartupStates() {
        return null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3773o = (ViewGroup) findViewById(R.id.tutorials_container);
        View findViewById = findViewById(R.id.tutorial_next_button);
        this.f3775q = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC1863g0(this, 0));
        View findViewById2 = findViewById(R.id.tutorial_prev_button);
        this.f3774p = findViewById2;
        findViewById2.setOnClickListener(new ViewOnClickListenerC1863g0(this, 1));
    }

    public void setListener(InterfaceC1865h0 interfaceC1865h0) {
    }
}
