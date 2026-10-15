package C0;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0015o implements DialogInterface.OnDismissListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ RunnableC0016p f353o;

    public DialogInterfaceOnDismissListenerC0015o(RunnableC0016p runnableC0016p) {
        this.f353o = runnableC0016p;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f353o.f359p.postDelayed(new A0.a(4, this), 600L);
    }
}
