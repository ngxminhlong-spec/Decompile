package E;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f688b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f689e;

    public /* synthetic */ f(String str, Context context, Object obj, int i4, int i5) {
        this.f687a = i5;
        this.f688b = str;
        this.c = context;
        this.f689e = obj;
        this.d = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i4 = this.f687a;
        int i5 = this.d;
        Object obj = this.f689e;
        Context context = this.c;
        String str = this.f688b;
        switch (i4) {
            case 0:
                Object[] objArr = {(e) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return i.b(str, context, Collections.unmodifiableList(arrayList), i5);
            default:
                try {
                    return i.b(str, context, (ArrayList) obj, i5);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
