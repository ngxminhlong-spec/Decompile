package P1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i extends FrameLayout implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final ImageButton f1517o;

    /* renamed from: p, reason: collision with root package name */
    public final a f1518p;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(android.content.Context r7, P1.h r8, P1.a r9) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.i.<init>(android.content.Context, P1.h, P1.a):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar = this.f1518p;
        if (aVar != null) {
            aVar.f1490J = 2;
            aVar.f1492p.finish();
        }
    }
}
