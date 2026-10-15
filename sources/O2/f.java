package O2;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1430a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1431b;

    public /* synthetic */ f(int i4) {
        this.f1430a = i4;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f4, Object obj, Object obj2) {
        switch (this.f1430a) {
            case 0:
                float floatValue = ((FloatEvaluator) this.f1431b).evaluate(f4, (Number) obj, (Number) obj2).floatValue();
                if (floatValue < 0.1f) {
                    floatValue = 0.0f;
                }
                return Float.valueOf(floatValue);
            default:
                A.e[] eVarArr = (A.e[]) obj;
                A.e[] eVarArr2 = (A.e[]) obj2;
                if (!android.support.v4.media.session.a.b(eVarArr, eVarArr2)) {
                    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                }
                if (!android.support.v4.media.session.a.b((A.e[]) this.f1431b, eVarArr)) {
                    this.f1431b = android.support.v4.media.session.a.f(eVarArr);
                }
                for (int i4 = 0; i4 < eVarArr.length; i4++) {
                    A.e eVar = ((A.e[]) this.f1431b)[i4];
                    A.e eVar2 = eVarArr[i4];
                    A.e eVar3 = eVarArr2[i4];
                    eVar.getClass();
                    eVar.f3a = eVar2.f3a;
                    int i5 = 0;
                    while (true) {
                        float[] fArr = eVar2.f4b;
                        if (i5 < fArr.length) {
                            eVar.f4b[i5] = (eVar3.f4b[i5] * f4) + ((1.0f - f4) * fArr[i5]);
                            i5++;
                        }
                    }
                }
                return (A.e[]) this.f1431b;
        }
    }
}
