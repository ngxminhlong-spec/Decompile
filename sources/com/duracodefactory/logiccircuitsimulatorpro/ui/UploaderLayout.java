package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.ViewOnClickListenerC0022w;
import C0.m0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import g2.x;
import o1.C1881r;
import o1.InterfaceC1875m0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class UploaderLayout extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public View f3789o;

    /* renamed from: p, reason: collision with root package name */
    public View f3790p;

    /* renamed from: q, reason: collision with root package name */
    public C1881r f3791q;

    /* renamed from: r, reason: collision with root package name */
    public m0 f3792r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC1875m0 f3793s;

    /* renamed from: t, reason: collision with root package name */
    public x f3794t;

    public UploaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3794t = new x(10, this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3789o = findViewById(R.id.share_project_loading);
        this.f3790p = findViewById(R.id.share_project_empty);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.upload_recycler);
        this.f3791q = new C1881r(this);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(this.f3791q);
        findViewById(R.id.back_arrow).setOnClickListener(new ViewOnClickListenerC0022w(20, this));
    }

    public void setInterface(InterfaceC1875m0 interfaceC1875m0) {
        this.f3793s = interfaceC1875m0;
    }
}
