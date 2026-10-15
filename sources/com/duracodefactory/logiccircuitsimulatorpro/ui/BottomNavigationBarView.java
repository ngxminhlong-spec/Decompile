package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class BottomNavigationBarView extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public View.OnClickListener f3578o;

    /* renamed from: p, reason: collision with root package name */
    public View f3579p;

    /* renamed from: q, reason: collision with root package name */
    public View f3580q;

    /* renamed from: r, reason: collision with root package name */
    public View f3581r;

    /* renamed from: s, reason: collision with root package name */
    public View f3582s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3583t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3584u;

    public BottomNavigationBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, Q.f246a, 0, 0);
        this.f3583t = obtainStyledAttributes.getColor(1, 0);
        this.f3584u = obtainStyledAttributes.getColor(0, 0);
    }

    public static AppCompatImageView a(View view) {
        return (AppCompatImageView) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    public static TextView b(View view) {
        return (TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(1);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3579p = findViewById(R.id.projects_tab);
        this.f3580q = findViewById(R.id.tutorials_tab);
        this.f3581r = findViewById(R.id.learning_tab);
        this.f3582s = findViewById(R.id.shared_tab);
        setListener(this.f3578o);
    }

    public void setListener(View.OnClickListener onClickListener) {
        this.f3578o = onClickListener;
        View view = this.f3579p;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            this.f3580q.setOnClickListener(onClickListener);
            this.f3581r.setOnClickListener(onClickListener);
            this.f3582s.setOnClickListener(onClickListener);
        }
    }

    public void setSelected(int i4) {
        TextView b4 = b(this.f3579p);
        b4.setTextColor(this.f3584u);
        b4.setTypeface(null, 0);
        a(this.f3579p).setColorFilter(this.f3584u);
        TextView b5 = b(this.f3580q);
        b5.setTextColor(this.f3584u);
        a(this.f3580q).setColorFilter(this.f3584u);
        b5.setTypeface(null, 0);
        TextView b6 = b(this.f3581r);
        b6.setTextColor(this.f3584u);
        a(this.f3581r).setColorFilter(this.f3584u);
        b6.setTypeface(null, 0);
        TextView b7 = b(this.f3582s);
        b7.setTextColor(this.f3584u);
        a(this.f3582s).setColorFilter(this.f3584u);
        b7.setTypeface(null, 0);
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(i4)).getChildAt(0);
        ImageView imageView = (ImageView) viewGroup.getChildAt(0);
        TextView textView = (TextView) viewGroup.getChildAt(1);
        textView.setTextColor(this.f3583t);
        textView.setTypeface(textView.getTypeface(), 1);
        imageView.setColorFilter(this.f3583t);
    }
}
