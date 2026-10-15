package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import g2.x;
import l1.e;
import o1.C1881r;
import o1.InterfaceC1886w;
import o1.ViewOnClickListenerC1885v;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class InsertProjectLayout extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public View f3634o;

    /* renamed from: p, reason: collision with root package name */
    public C1881r f3635p;

    /* renamed from: q, reason: collision with root package name */
    public e f3636q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1886w f3637r;

    /* renamed from: s, reason: collision with root package name */
    public View f3638s;

    /* renamed from: t, reason: collision with root package name */
    public View f3639t;

    /* renamed from: u, reason: collision with root package name */
    public View f3640u;

    /* renamed from: v, reason: collision with root package name */
    public x f3641v;

    public InsertProjectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3641v = new x(6, this);
    }

    public final void a(String str) {
        if (this.f3636q != null) {
            return;
        }
        e eVar = new e(this, getContext(), str);
        this.f3636q = eVar;
        eVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3634o = findViewById(R.id.insert_project_loading);
        this.f3638s = findViewById(R.id.insert_project_empty);
        this.f3639t = findViewById(R.id.show_help);
        this.f3640u = findViewById(R.id.io_node_help);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.projects_recycler);
        this.f3635p = new C1881r(this);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(this.f3635p);
        this.f3639t.setOnClickListener(new ViewOnClickListenerC1885v(this, 0));
        this.f3640u.setOnClickListener(new ViewOnClickListenerC1885v(this, 1));
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i4) {
        if (this.f3640u.getVisibility() == 0 && i4 != 0) {
            this.f3640u.setVisibility(4);
        }
        super.onVisibilityChanged(view, i4);
    }

    public void setInterface(InterfaceC1886w interfaceC1886w) {
        this.f3637r = interfaceC1886w;
    }
}
