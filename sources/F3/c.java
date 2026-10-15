package F3;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1510e1;
import d3.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f754l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f755m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C1510e1 c1510e1, g gVar, Uri uri, int i4) {
        super(c1510e1, gVar);
        this.f754l = i4;
        switch (i4) {
            case 1:
                super(c1510e1, gVar);
                this.f755m = uri;
                m("X-Goog-Upload-Protocol", "resumable");
                m("X-Goog-Upload-Command", "query");
                return;
            default:
                this.f755m = uri;
                m("X-Goog-Upload-Protocol", "resumable");
                m("X-Goog-Upload-Command", "cancel");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C1510e1 c1510e1, g gVar, JSONObject jSONObject, String str) {
        super(c1510e1, gVar);
        this.f754l = 2;
        this.f755m = jSONObject;
        if (TextUtils.isEmpty(str)) {
            this.f744a = new IllegalArgumentException("mContentType is null or empty");
        }
        m("X-Goog-Upload-Protocol", "resumable");
        m("X-Goog-Upload-Command", "start");
        m("X-Goog-Upload-Header-Content-Type", str);
    }

    @Override // F3.a
    public JSONObject c() {
        switch (this.f754l) {
            case 2:
                return (JSONObject) this.f755m;
            default:
                return super.c();
        }
    }

    @Override // F3.a
    public Map f() {
        switch (this.f754l) {
            case 2:
                HashMap hashMap = new HashMap();
                String path = ((Uri) this.f745b.f11915q).getPath();
                if (path == null) {
                    path = "";
                } else if (path.startsWith("/")) {
                    path = path.substring(1);
                }
                hashMap.put("name", path);
                hashMap.put("uploadType", "resumable");
                return hashMap;
            default:
                return super.f();
        }
    }

    @Override // F3.a
    public final Uri i() {
        switch (this.f754l) {
            case 0:
                return (Uri) this.f755m;
            case 1:
                return (Uri) this.f755m;
            default:
                C1510e1 c1510e1 = this.f745b;
                String authority = ((Uri) c1510e1.f11915q).getAuthority();
                Uri.Builder buildUpon = ((Uri) c1510e1.f11914p).buildUpon();
                buildUpon.appendPath("b");
                buildUpon.appendPath(authority);
                buildUpon.appendPath("o");
                return buildUpon.build();
        }
    }
}
