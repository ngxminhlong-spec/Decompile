package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.ViewOnClickListenerC0022w;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;
import o1.C1881r;
import o1.InterfaceC1851a0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class TimeDiagramListLayout extends FrameLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f3734r = 0;

    /* renamed from: o, reason: collision with root package name */
    public C1881r f3735o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC1851a0 f3736p;

    /* renamed from: q, reason: collision with root package name */
    public View f3737q;

    public TimeDiagramListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(ArrayList arrayList) {
        C1881r c1881r = this.f3735o;
        c1881r.d = arrayList;
        c1881r.d();
        this.f3737q.setVisibility(arrayList.isEmpty() ? 0 : 8);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3737q = findViewById(R.id.timediagram_empty);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.timediagram_list_recycler);
        this.f3735o = new C1881r(this);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(this.f3735o);
        findViewById(R.id.timediagram_add).setOnClickListener(new ViewOnClickListenerC0022w(17, this));
    }

    public void setInterface(InterfaceC1851a0 interfaceC1851a0) {
        this.f3736p = interfaceC1851a0;
    }
}
