package f;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1666a implements AdapterView.OnItemClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1669d f12784o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1667b f12785p;

    public C1666a(C1667b c1667b, C1669d c1669d) {
        this.f12785p = c1667b;
        this.f12784o = c1669d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        C1667b c1667b = this.f12785p;
        DialogInterface.OnClickListener onClickListener = c1667b.f12796m;
        C1669d c1669d = this.f12784o;
        onClickListener.onClick(c1669d.f12807b, i4);
        if (c1667b.f12798o) {
            return;
        }
        c1669d.f12807b.dismiss();
    }
}
