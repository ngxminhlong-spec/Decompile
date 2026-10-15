package P2;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import b0.e0;
import com.google.android.material.internal.NavigationMenuView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m extends e0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f1579f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f1579f = pVar;
    }

    @Override // b0.e0, H.C0027b
    public final void d(View view, I.g gVar) {
        super.d(view, gVar);
        p pVar = this.f1579f.f1593s.f1574f;
        int i4 = pVar.f1590p.getChildCount() == 0 ? 0 : 1;
        for (int i5 = 0; i5 < pVar.f1593s.c.size(); i5++) {
            if (pVar.f1593s.c(i5) == 0) {
                i4++;
            }
        }
        gVar.f918a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i4, 0, false));
    }
}
