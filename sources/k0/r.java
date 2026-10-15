package k0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public o f13551o;

    /* renamed from: p, reason: collision with root package name */
    public ViewGroup f13552p;

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5 A[EDGE_INSN: B:115:0x01f5->B:116:0x01f5 BREAK  A[LOOP:1: B:16:0x0084->B:28:0x01eb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.r.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f13552p;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        s.f13554b.remove(viewGroup);
        ArrayList arrayList = (ArrayList) s.a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((o) obj).x(viewGroup);
            }
        }
        this.f13551o.i(true);
    }
}
