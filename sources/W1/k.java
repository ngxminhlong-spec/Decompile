package W1;

import O1.C0081p;
import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.ads.As;
import com.google.android.gms.internal.ads.Bs;
import com.google.android.gms.internal.ads.C0370Za;
import com.google.android.gms.internal.ads.Du;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Du {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2008b;

    public /* synthetic */ k(int i4, Object obj) {
        this.f2007a = i4;
        this.f2008b = obj;
    }

    @Override // com.google.android.gms.internal.ads.Du
    public final InterfaceFutureC0239a l(Object obj) {
        switch (this.f2007a) {
            case 0:
                b bVar = (b) this.f2008b;
                final Uri uri = (Uri) obj;
                return Bs.m0(bVar.M3("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new As() { // from class: W1.l
                    @Override // com.google.android.gms.internal.ads.As
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean isEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = uri;
                        return !isEmpty ? b.S3(uri2, "nas", str) : uri2;
                    }
                }, bVar.f1977u);
            case 1:
                b bVar2 = (b) this.f2008b;
                return Bs.m0(bVar2.M3("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new i(0, bVar2, (ArrayList) obj), bVar2.f1977u);
            default:
                f fVar = new f(new JsonReader(new InputStreamReader((InputStream) obj)));
                try {
                    fVar.f1994b = C0081p.f1374f.f1375a.f(((C0370Za) this.f2008b).f7989o).toString();
                } catch (JSONException unused) {
                    fVar.f1994b = "{}";
                }
                return Bs.h0(fVar);
        }
    }
}
