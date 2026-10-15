package androidx.fragment.app;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import f.AbstractActivityC1671f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158g extends o implements androidx.lifecycle.w, androidx.lifecycle.i {

    /* renamed from: p, reason: collision with root package name */
    public final AbstractActivityC1671f f2860p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractActivityC1671f f2861q;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f2862r;

    /* renamed from: s, reason: collision with root package name */
    public final s f2863s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1671f f2864t;

    public C0158g(AbstractActivityC1671f abstractActivityC1671f) {
        this.f2864t = abstractActivityC1671f;
        Handler handler = new Handler();
        this.f2863s = new s();
        this.f2860p = abstractActivityC1671f;
        this.f2861q = abstractActivityC1671f;
        this.f2862r = handler;
    }

    @Override // androidx.fragment.app.o
    public final View b(int i4) {
        return this.f2864t.findViewById(i4);
    }

    @Override // androidx.fragment.app.o
    public final boolean c() {
        Window window = this.f2864t.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    public final void d(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f, Intent intent, int i4) {
        AbstractActivityC1671f abstractActivityC1671f = this.f2864t;
        abstractActivityC1671f.f12834C = true;
        try {
            if (i4 == -1) {
                abstractActivityC1671f.startActivityForResult(intent, -1, null);
            } else {
                AbstractActivityC1671f.m(i4);
                abstractActivityC1671f.startActivityForResult(intent, ((abstractActivityC1671f.l(abstractComponentCallbacksC0157f) + 1) << 16) + (i4 & 65535), null);
            }
        } finally {
            abstractActivityC1671f.f12834C = false;
        }
    }

    @Override // androidx.lifecycle.w
    public final androidx.lifecycle.v e() {
        return this.f2864t.e();
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.k f() {
        return this.f2864t.f12839x;
    }
}
