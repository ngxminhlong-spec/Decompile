package V2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m extends s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1923b;
    public final /* synthetic */ Matrix c;

    public m(ArrayList arrayList, Matrix matrix) {
        this.f1923b = arrayList;
        this.c = matrix;
    }

    @Override // V2.s
    public final void a(Matrix matrix, U2.a aVar, int i4, Canvas canvas) {
        ArrayList arrayList = this.f1923b;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((s) obj).a(this.c, aVar, i4, canvas);
        }
    }
}
