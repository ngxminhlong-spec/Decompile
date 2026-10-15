package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.q0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.SkuDetails;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;
import o1.InterfaceC1870k;
import o1.ViewOnClickListenerC1868j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class GoPremiumLayout extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public final q0 f3611o;

    /* renamed from: p, reason: collision with root package name */
    public RecyclerView f3612p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1870k f3613q;

    /* renamed from: r, reason: collision with root package name */
    public View f3614r;

    /* renamed from: s, reason: collision with root package name */
    public View f3615s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3616t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3617u;

    public GoPremiumLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.price_default_padding);
        this.f3617u = dimensionPixelSize;
        this.f3616t = dimensionPixelSize;
        this.f3611o = new q0(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.main_purchases);
        this.f3612p = recyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.f3612p.setAdapter(this.f3611o);
        findViewById(R.id.pricing_back_arrow).setOnClickListener(new ViewOnClickListenerC1868j(this, 0));
        View findViewById = findViewById(R.id.purchase_button);
        this.f3615s = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC1868j(this, 1));
        this.f3614r = findViewById(R.id.prices_error);
    }

    public void setHighSkus(ArrayList<SkuDetails> arrayList) {
    }

    public void setListener(InterfaceC1870k interfaceC1870k) {
        this.f3613q = interfaceC1870k;
    }

    public void setLowPrices(int i4) {
    }

    public void setMessage(int i4) {
        ((TextView) findViewById(R.id.why_buy_message)).setText(i4);
        findViewById(R.id.why_buy_message_container).setVisibility(0);
    }
}
