package Z;

import O1.a1;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.BinderC0489cm;
import com.google.android.gms.internal.ads.Bs;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0272Fc;
import com.google.android.gms.internal.ads.C0348Ud;
import com.google.android.gms.internal.ads.C0443bi;
import com.google.android.gms.internal.ads.C0640g8;
import com.google.android.gms.internal.ads.C1434yp;
import com.google.android.gms.internal.ads.C1466ze;
import com.google.android.gms.internal.ads.Cp;
import com.google.android.gms.internal.ads.InterfaceC0570ei;
import com.google.android.gms.internal.ads.Jp;
import com.google.android.gms.internal.ads.Og;
import com.google.android.gms.internal.ads.Y9;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements InterfaceC0570ei {

    /* renamed from: o, reason: collision with root package name */
    public boolean f2261o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f2262p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f2263q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f2264r;

    /* renamed from: s, reason: collision with root package name */
    public Object f2265s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f2266t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2267u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2268v;

    public c(AssetManager assetManager, Executor executor, f fVar, String str, File file) {
        this.f2261o = false;
        this.f2262p = executor;
        this.f2263q = fVar;
        this.f2267u = str;
        this.f2266t = file;
        int i4 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i4 >= 24 && i4 <= 33) {
            switch (i4) {
                case 24:
                case 25:
                    bArr = g.f2282h;
                    break;
                case 26:
                    bArr = g.f2281g;
                    break;
                case 27:
                    bArr = g.f2280f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.f2279e;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = g.d;
                    break;
            }
        }
        this.f2264r = bArr;
    }

    public c(C0248Bc c0248Bc, C0272Fc c0272Fc, C1434yp c1434yp, C0348Ud c0348Ud, Jp jp, boolean z4, C0640g8 c0640g8, BinderC0489cm binderC0489cm) {
        this.f2262p = c0248Bc;
        this.f2263q = c0272Fc;
        this.f2264r = c1434yp;
        this.f2265s = c0348Ud;
        this.f2266t = jp;
        this.f2261o = z4;
        this.f2267u = c0640g8;
        this.f2268v = binderC0489cm;
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((f) this.f2263q).l();
            return null;
        }
    }

    public void b(final int i4, final Serializable serializable) {
        ((Executor) this.f2262p).execute(new Runnable() { // from class: Z.b
            @Override // java.lang.Runnable
            public final void run() {
                ((f) c.this.f2263q).n(i4, serializable);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570ei
    public void j(boolean z4, Context context, Og og) {
        boolean z5;
        Jp jp = (Jp) this.f2266t;
        C0640g8 c0640g8 = (C0640g8) this.f2267u;
        C1434yp c1434yp = (C1434yp) this.f2264r;
        C1466ze c1466ze = (C1466ze) Bs.q0((C0272Fc) this.f2263q);
        ((C0348Ud) this.f2265s).y0(true);
        boolean z6 = this.f2261o;
        boolean c = z6 ? c0640g8.c(true) : true;
        if (z6) {
            synchronized (c0640g8) {
                z5 = c0640g8.f8788b;
            }
        } else {
            z5 = false;
        }
        N1.h hVar = new N1.h(c, true, z5, z6 ? c0640g8.a() : 0.0f, z4, c1434yp.f11488O, false);
        if (og != null) {
            og.d();
        }
        C2033d c2033d = N1.n.f1204A.f1206b;
        C0443bi c0443bi = (C0443bi) c1466ze.f11614x.c();
        C0348Ud c0348Ud = (C0348Ud) this.f2265s;
        int i4 = c1434yp.f11490Q;
        if (i4 == -1) {
            a1 a1Var = jp.f5915j;
            if (a1Var != null) {
                int i5 = a1Var.f1345o;
                if (i5 == 1) {
                    i4 = 7;
                } else if (i5 == 2) {
                    i4 = 6;
                }
            }
            Y9.m("Error setting app open orientation; no targeting orientation available.");
            i4 = c1434yp.f11490Q;
        }
        int i6 = i4;
        C0248Bc c0248Bc = (C0248Bc) this.f2262p;
        String str = c1434yp.f11476B;
        Cp cp = c1434yp.f11534s;
        C2033d.m(context, new AdOverlayInfoParcel(c0443bi, c0348Ud, i6, c0248Bc, str, hVar, cp.f4552b, cp.f4551a, jp.f5911f, og, c1434yp.f11515i0 ? (BinderC0489cm) this.f2268v : null), true);
    }
}
