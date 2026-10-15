package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b0.AbstractC0171E;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;
import o1.C1867i0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class TutorialView2 extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public RecyclerView f3777o;

    /* renamed from: p, reason: collision with root package name */
    public final C1867i0 f3778p;

    /* renamed from: q, reason: collision with root package name */
    public int f3779q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f3780r;

    /* JADX WARN: Type inference failed for: r1v1, types: [o1.i0, b0.E] */
    public TutorialView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ?? abstractC0171E = new AbstractC0171E();
        abstractC0171E.c = new ArrayList();
        this.f3778p = abstractC0171E;
    }

    public final void a(int i4, ArrayList arrayList) {
        this.f3779q = i4;
        TextView textView = this.f3780r;
        if (textView != null) {
            textView.setText(i4);
        }
        C1867i0 c1867i0 = this.f3778p;
        c1867i0.c = arrayList;
        c1867i0.d();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.new_tut_recycler);
        this.f3777o = recyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView2 = this.f3777o;
        C1867i0 c1867i0 = this.f3778p;
        recyclerView2.setAdapter(c1867i0);
        c1867i0.d();
        TextView textView = (TextView) findViewById(R.id.tutorial_title);
        this.f3780r = textView;
        int i4 = this.f3779q;
        if (i4 != 0) {
            textView.setText(i4);
        }
    }
}
