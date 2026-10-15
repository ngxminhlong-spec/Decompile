package P1;

import Q1.C0111j;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends RelativeLayout {

    /* renamed from: o, reason: collision with root package name */
    public final C0111j f1512o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1513p;

    public d(Context context, String str, String str2, String str3) {
        super(context);
        C0111j c0111j = new C0111j(context);
        c0111j.c = str;
        this.f1512o = c0111j;
        c0111j.f1705e = str2;
        c0111j.d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f1513p) {
            return false;
        }
        this.f1512o.a(motionEvent);
        return false;
    }
}
