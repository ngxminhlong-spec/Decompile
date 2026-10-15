package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import o1.InterfaceC1873l0;
import o1.ViewOnClickListenerC1871k0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class UploadDialog extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public TextView f3781o;

    /* renamed from: p, reason: collision with root package name */
    public View f3782p;

    /* renamed from: q, reason: collision with root package name */
    public View f3783q;

    /* renamed from: r, reason: collision with root package name */
    public View f3784r;

    /* renamed from: s, reason: collision with root package name */
    public View f3785s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1873l0 f3786t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f3787u;

    /* renamed from: v, reason: collision with root package name */
    public View f3788v;

    public UploadDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3781o = (TextView) findViewById(R.id.explanation);
        this.f3782p = findViewById(R.id.uploading_container);
        this.f3783q = findViewById(R.id.buttons_container);
        this.f3784r = findViewById(R.id.close_container);
        this.f3785s = findViewById(R.id.progresser);
        this.f3787u = (TextView) findViewById(R.id.upload_percents);
        this.f3788v = findViewById(R.id.progressser_container);
        findViewById(R.id.upload_ok).setOnClickListener(new ViewOnClickListenerC1871k0(this, 0));
        findViewById(R.id.upload_cancel).setOnClickListener(new ViewOnClickListenerC1871k0(this, 1));
        findViewById(R.id.close).setOnClickListener(new ViewOnClickListenerC1871k0(this, 2));
    }

    public void setListener(InterfaceC1873l0 interfaceC1873l0) {
        this.f3786t = interfaceC1873l0;
    }

    public void setProgress(float f4) {
        this.f3785s.setPadding((int) (this.f3788v.getWidth() * f4), 0, 0, 0);
        TextView textView = this.f3787u;
        StringBuilder sb = new StringBuilder("");
        sb.append((int) (f4 * 100.0f));
        sb.append(" %");
        textView.setText(sb.toString());
    }
}
