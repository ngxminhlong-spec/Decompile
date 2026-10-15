package C0;

import android.content.DialogInterface;
import o1.DialogC1832H;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0023x implements DialogInterface.OnDismissListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f447o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ DialogC1832H f448p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ H f449q;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0023x(H h4, DialogC1832H dialogC1832H, int i4) {
        this.f447o = i4;
        this.f449q = h4;
        this.f448p = dialogC1832H;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f447o) {
            case 0:
                if (this.f448p.f14210o) {
                    ((D) this.f449q).C(new String[]{"android.permission.RECORD_AUDIO"});
                    return;
                }
                return;
            default:
                if (this.f448p.f14210o) {
                    ((D0.g) this.f449q).C(new String[]{"android.permission.RECORD_AUDIO"});
                    return;
                }
                return;
        }
    }
}
