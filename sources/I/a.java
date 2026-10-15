package I;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: o, reason: collision with root package name */
    public final int f903o;

    /* renamed from: p, reason: collision with root package name */
    public final g f904p;

    /* renamed from: q, reason: collision with root package name */
    public final int f905q;

    public a(int i4, g gVar, int i5) {
        this.f903o = i4;
        this.f904p = gVar;
        this.f905q = i5;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f903o);
        this.f904p.f918a.performAction(this.f905q, bundle);
    }
}
