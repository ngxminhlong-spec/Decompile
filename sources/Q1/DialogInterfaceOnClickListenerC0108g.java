package Q1;

import android.content.DialogInterface;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: Q1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0108g implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1695o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1696p;

    public /* synthetic */ DialogInterfaceOnClickListenerC0108g(int i4, Object obj) {
        this.f1695o = i4;
        this.f1696p = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f1695o) {
            case 0:
                ((AtomicInteger) this.f1696p).set(i4);
                return;
            case 1:
                ((C0111j) this.f1696p).b();
                return;
            default:
                N n4 = N1.n.f1204A.c;
                N.p(((RunnableC0113l) this.f1696p).f1714o, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                return;
        }
    }
}
