package W1;

import com.google.android.gms.internal.ads.As;
import com.google.android.gms.internal.ads.Y9;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements As {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n f2011b = new n(0);
    public static final /* synthetic */ n c = new n(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2012a;

    public /* synthetic */ n(int i4) {
        this.f2012a = i4;
    }

    @Override // com.google.android.gms.internal.ads.As
    public final Object apply(Object obj) {
        switch (this.f2012a) {
            case 0:
                ArrayList arrayList = b.f1949U;
                return ((JSONObject) obj).optString("nas");
            default:
                ArrayList arrayList2 = b.f1949U;
                Y9.q("", (Exception) obj);
                return null;
        }
    }
}
