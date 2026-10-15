package W1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.As;
import com.google.android.gms.internal.ads.BinderC0596f7;
import com.google.android.gms.internal.ads.C0315Oa;
import com.google.android.gms.internal.ads.C0370Za;
import com.google.android.gms.internal.ads.C0657gj;
import com.google.android.gms.internal.ads.C1151s6;
import com.google.android.gms.internal.ads.El;
import com.google.android.gms.internal.ads.InterfaceC0385a9;
import com.google.android.gms.internal.ads.InterfaceC0597f8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements As {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2004b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i4, Object obj, Object obj2) {
        this.f2003a = i4;
        this.f2004b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.As
    public final Object apply(Object obj) {
        switch (this.f2003a) {
            case 0:
                b bVar = (b) this.f2004b;
                List<Uri> list = (List) this.c;
                String str = (String) obj;
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list) {
                    if (!b.R3(uri, bVar.f1967P, bVar.f1968Q) || TextUtils.isEmpty(str)) {
                        arrayList.add(uri);
                    } else {
                        arrayList.add(b.S3(uri, "nas", str));
                    }
                }
                return arrayList;
            case 1:
                InterfaceC0385a9 interfaceC0385a9 = (InterfaceC0385a9) obj;
                interfaceC0385a9.e((String) this.f2004b, (InterfaceC0597f8) this.c);
                return interfaceC0385a9;
            case 2:
                C0657gj c0657gj = (C0657gj) this.f2004b;
                JSONObject jSONObject = (JSONObject) this.c;
                List list2 = (List) obj;
                c0657gj.getClass();
                if (list2 == null || list2.isEmpty()) {
                    return null;
                }
                String optString = jSONObject.optString("text");
                Integer d = C0657gj.d("bg_color", jSONObject);
                Integer d4 = C0657gj.d("text_color", jSONObject);
                int optInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                int optInt2 = jSONObject.optInt("animation_ms", 1000);
                return new BinderC0596f7(optString, list2, d, d4, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, c0657gj.f8847h.f9129s);
            default:
                C1151s6 c1151s6 = (C1151s6) this.f2004b;
                C0370Za c0370Za = (C0370Za) this.c;
                El el = (El) obj;
                el.c.put("Content-Type", el.f4925e);
                String u2 = N1.n.f1204A.c.u((Context) c1151s6.f10580f, c0370Za.f7990p.f4084o);
                HashMap hashMap = el.c;
                hashMap.put("User-Agent", u2);
                Bundle bundle = new Bundle();
                for (Map.Entry entry : hashMap.entrySet()) {
                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                }
                return new C0315Oa(el.f4923a, el.f4924b, bundle, el.d, el.f4926f, c0370Za.f7992r, c0370Za.f7996v);
        }
    }
}
