package Q1;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: Q1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0113l implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f1714o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f1715p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f1716q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f1717r;

    public RunnableC0113l(Context context, String str, boolean z4, boolean z5) {
        this.f1714o = context;
        this.f1715p = str;
        this.f1716q = z4;
        this.f1717r = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N n4 = N1.n.f1204A.c;
        AlertDialog.Builder h4 = N.h(this.f1714o);
        h4.setMessage(this.f1715p);
        if (this.f1716q) {
            h4.setTitle("Error");
        } else {
            h4.setTitle("Info");
        }
        if (this.f1717r) {
            h4.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            h4.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC0108g(2, this));
            h4.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        h4.create().show();
    }
}
