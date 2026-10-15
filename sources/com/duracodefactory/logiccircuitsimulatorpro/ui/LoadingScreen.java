package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import g2.x;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class LoadingScreen extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public int f3647A;

    /* renamed from: B, reason: collision with root package name */
    public int f3648B;

    /* renamed from: C, reason: collision with root package name */
    public int f3649C;

    /* renamed from: D, reason: collision with root package name */
    public int f3650D;

    /* renamed from: E, reason: collision with root package name */
    public int f3651E;

    /* renamed from: F, reason: collision with root package name */
    public View.OnClickListener f3652F;

    /* renamed from: G, reason: collision with root package name */
    public final x f3653G;

    /* renamed from: o, reason: collision with root package name */
    public TextView f3654o;

    /* renamed from: p, reason: collision with root package name */
    public View f3655p;

    /* renamed from: q, reason: collision with root package name */
    public View f3656q;

    /* renamed from: r, reason: collision with root package name */
    public View f3657r;

    /* renamed from: s, reason: collision with root package name */
    public View f3658s;

    /* renamed from: t, reason: collision with root package name */
    public View f3659t;

    /* renamed from: u, reason: collision with root package name */
    public View f3660u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3661v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3662w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3663x;
    public String y;

    /* renamed from: z, reason: collision with root package name */
    public int f3664z;

    public LoadingScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3664z = 20;
        this.f3648B = 40;
        this.f3650D = 11;
        this.f3653G = new x(8, this);
    }

    public final void a(String str, int i4, int i5, View.OnClickListener onClickListener) {
        this.f3663x = true;
        this.f3652F = onClickListener;
        this.f3664z = 1;
        if (i4 > 50) {
            this.f3664z = 4;
        }
        if (i4 > 100) {
            this.f3664z = 8;
        }
        this.f3648B = 2;
        if (i5 > 50) {
            this.f3648B = 6;
        }
        if (i5 > 100) {
            this.f3648B = 12;
        }
        this.f3650D = (int) Math.max(1.0d, Math.random() * 3.0d);
        this.y = str;
        TextView textView = this.f3654o;
        if (textView == null) {
            return;
        }
        textView.setText(str);
        postDelayed(this.f3653G, 256L);
        this.f3662w = true;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3654o = (TextView) findViewById(R.id.anim_load_name);
        this.f3655p = findViewById(R.id.anim_load_elem_checked);
        this.f3656q = findViewById(R.id.anim_load_elem_unchecked);
        this.f3657r = findViewById(R.id.anim_load_conn_checked);
        this.f3658s = findViewById(R.id.anim_load_conn_unchecked);
        this.f3659t = findViewById(R.id.anim_load_init_checked);
        this.f3660u = findViewById(R.id.anim_load_init_unchecked);
        if (this.f3662w || !this.f3663x) {
            return;
        }
        this.f3654o.setText(this.y);
        postDelayed(this.f3653G, 256L);
        this.f3662w = true;
    }
}
