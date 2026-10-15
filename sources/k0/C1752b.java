package k0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1752b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13502a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1752b(Class cls, String str, int i4) {
        super(cls, str);
        this.f13502a = i4;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f13502a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(w.f13563a.y((View) obj));
            default:
                WeakHashMap weakHashMap = H.A.f779a;
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f13502a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f13505a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f13506b = round;
                int i4 = eVar.f13508f + 1;
                eVar.f13508f = i4;
                if (i4 == eVar.f13509g) {
                    w.a(eVar.f13507e, eVar.f13505a, round, eVar.c, eVar.d);
                    eVar.f13508f = 0;
                    eVar.f13509g = 0;
                    return;
                }
                return;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.d = round2;
                int i5 = eVar2.f13509g + 1;
                eVar2.f13509g = i5;
                if (eVar2.f13508f == i5) {
                    w.a(eVar2.f13507e, eVar2.f13505a, eVar2.f13506b, eVar2.c, round2);
                    eVar2.f13508f = 0;
                    eVar2.f13509g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                w.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                w.f13563a.Q((View) obj, floatValue);
                return;
            default:
                WeakHashMap weakHashMap = H.A.f779a;
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
