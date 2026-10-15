package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Qf extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: o, reason: collision with root package name */
    public final Context f6669o;

    /* renamed from: p, reason: collision with root package name */
    public View f6670p;

    public Qf(Context context) {
        super(context);
        this.f6669o = context;
    }

    public static Qf a(Context context, View view, C1434yp c1434yp) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        Qf qf = new Qf(context);
        boolean isEmpty = c1434yp.f11538u.isEmpty();
        Context context2 = qf.f6669o;
        if (!isEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f4 = ((C1477zp) c1434yp.f11538u.get(0)).f11687a;
            float f5 = displayMetrics.density;
            qf.setLayoutParams(new FrameLayout.LayoutParams((int) (f4 * f5), (int) (r2.f11688b * f5)));
        }
        qf.f6670p = view;
        qf.addView(view);
        C1016p c1016p = N1.n.f1204A.f1227z;
        ViewTreeObserverOnScrollChangedListenerC0297Kc viewTreeObserverOnScrollChangedListenerC0297Kc = new ViewTreeObserverOnScrollChangedListenerC0297Kc(qf, qf);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC0297Kc.f3928o).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnScrollChangedListenerC0297Kc.r1(viewTreeObserver);
        }
        ViewTreeObserverOnGlobalLayoutListenerC0292Jc viewTreeObserverOnGlobalLayoutListenerC0292Jc = new ViewTreeObserverOnGlobalLayoutListenerC0292Jc(qf, qf);
        View view3 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0292Jc.f3928o).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0292Jc.r1(viewTreeObserver3);
        }
        JSONObject jSONObject = c1434yp.f11513h0;
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            qf.b(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            qf.b(optJSONObject2, relativeLayout, 12);
        }
        qf.addView(relativeLayout);
        return qf;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i4) {
        Context context = this.f6669o;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double optDouble = jSONObject.optDouble("padding", 0.0d);
        C0081p c0081p = C0081p.f1374f;
        C1335wc c1335wc = c0081p.f1375a;
        int l4 = C1335wc.l(context, (int) optDouble);
        textView.setPadding(0, l4, 0, l4);
        double optDouble2 = jSONObject.optDouble("height", 15.0d);
        C1335wc c1335wc2 = c0081p.f1375a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1335wc.l(context, (int) optDouble2));
        layoutParams.addRule(i4);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f6670p.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f6670p.setY(-r0[1]);
    }
}
