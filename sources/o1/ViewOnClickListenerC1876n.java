package o1;

import android.view.View;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1876n implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14284o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ DialogC1878o f14285p;

    public /* synthetic */ ViewOnClickListenerC1876n(DialogC1878o dialogC1878o, int i4) {
        this.f14284o = i4;
        this.f14285p = dialogC1878o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14284o) {
            case 0:
                this.f14285p.dismiss();
                return;
            default:
                DialogC1878o dialogC1878o = this.f14285p;
                AbstractC1895f.w(dialogC1878o.f14289o, dialogC1878o.f14290p, false, true);
                dialogC1878o.dismiss();
                return;
        }
    }
}
