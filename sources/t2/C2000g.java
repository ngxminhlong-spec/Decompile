package t2;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import com.google.android.gms.internal.ads.C0831kn;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import q1.C1947b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2000g {

    /* renamed from: a, reason: collision with root package name */
    public final Application f14896a;

    /* renamed from: b, reason: collision with root package name */
    public final C2006m f14897b;
    public final C1997d c;
    public final C2004k d;

    /* renamed from: e, reason: collision with root package name */
    public final C0831kn f14898e;

    /* renamed from: f, reason: collision with root package name */
    public Dialog f14899f;

    /* renamed from: g, reason: collision with root package name */
    public C2005l f14900g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f14901h = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f14902i = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f14903j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f14904k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public boolean f14905l = false;

    public C2000g(Application application, C2006m c2006m, C1997d c1997d, C2004k c2004k, C0831kn c0831kn) {
        this.f14896a = application;
        this.f14897b = c2006m;
        this.c = c1997d;
        this.d = c2004k;
        this.f14898e = c0831kn;
    }

    public final void a(Activity activity, C1947b c1947b) {
        s.a();
        if (!this.f14901h.compareAndSet(false, true)) {
            new K(true != this.f14905l ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.", 3).a();
            c1947b.a();
            return;
        }
        C1998e c1998e = new C1998e(this, activity);
        this.f14896a.registerActivityLifecycleCallbacks(c1998e);
        this.f14904k.set(c1998e);
        this.f14897b.f14918a = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f14900g);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            new K("Activity with null windows is passed in.", 3).a();
            c1947b.a();
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        this.f14903j.set(c1947b);
        dialog.show();
        this.f14899f = dialog;
        this.f14900g.a("UMP_messagePresented", "");
    }

    public final void b(b3.d dVar, b3.c cVar) {
        C0831kn c0831kn = this.f14898e;
        C2006m c2006m = (C2006m) ((E) c0831kn.f9319p).c();
        Handler handler = s.f14935a;
        r.c(handler);
        C2005l c2005l = new C2005l(c2006m, handler, ((N1.l) c0831kn.f9320q).h());
        this.f14900g = c2005l;
        c2005l.setBackgroundColor(0);
        c2005l.getSettings().setJavaScriptEnabled(true);
        c2005l.setWebViewClient(new N1.j(1, c2005l));
        this.f14902i.set(new C1999f(dVar, cVar));
        C2005l c2005l2 = this.f14900g;
        C2004k c2004k = this.d;
        c2005l2.loadDataWithBaseURL(c2004k.f14912a, c2004k.f14913b, "text/html", "UTF-8", null);
        handler.postDelayed(new g2.x(12, this), 10000L);
    }

    public final void c() {
        Dialog dialog = this.f14899f;
        if (dialog != null) {
            dialog.dismiss();
            this.f14899f = null;
        }
        this.f14897b.f14918a = null;
        C1998e c1998e = (C1998e) this.f14904k.getAndSet(null);
        if (c1998e != null) {
            c1998e.f14893p.f14896a.unregisterActivityLifecycleCallbacks(c1998e);
        }
    }
}
