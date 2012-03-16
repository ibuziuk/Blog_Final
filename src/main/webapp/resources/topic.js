// Подсчет символов
function f() {
    var text = document.getElementById('te');
    var content = te.value;
    var length = content.length;
    if (length > 500)
        text.value = content.substr(0, 500);

    var hint = document.getElementById('hint');
    var left = 500 - length;
    if (left < 0) left = 0;
    hint.innerHTML = 'Characters left:' + left;

}

function destroy() {
    if (confirm("Bы уверены, что хотите уничтожить эту страницу?"))
        location.href = 'delete/{topic.id}'


    /*location.href='delete/${topic.id}'  */

    /*else
     alert("Вопрос закрыт!") ;*/
}


// подтверждение удаления
function deleteTopic(url) {
    var isOK = confirm("Are you sure to delete?");
    if (isOK) {
        go(url);
    }
}

function go(url) {
    window.location = url;
}


// масска ввода для даты
function setMask(I, M) {
    function R(s) {
        return new RegExp('(' + s.replace(/\(/g, '\\(').replace(/\)/g, '\\)').replace(/\//g, '\\/')
            .replace(/9/g, '\\d').replace(/a/g, '[a-zа-яё]').replace(/\*/g, '[a-zа-яё0-9]') + ')', 'gi')
    }

    function N(c) {
        for (var i = 0,s = ''; i < L; i++)s += $[i] || c;

        return s
    }

    function D(e, p, i) {
        p = I.gC();
        if (p[0] == p[1]) {
            if (e)p[1]++;
            else p[0]--
        }
        for (i = p[0]; i < p[1]; i++)
            if (!S[i] && $[i]) {
                $[i] = 0;
                j--
            }
        return p
    }

    function V() {
        setTimeout(function(k) {
            if (R(M).test(I.value)) {
                I.value = RegExp.$1;
                $ = I.value.split('');
                for (k = 0; k < L; k++)if (!S[k])j++
            }
            else {
                I.value = N('_');
                I.sC(i)
            }
        }, 0)
    }

    function P(c) {
        if (c < 35 && c != 8 || c == 45) return 1;
        switch (c) {
            case 8:
                i = D()[0];
                return 0;
            case 46:
                i = D(1)[1];
                return 0;
            case 35:
                i = L;
                return 1;
            case 36:
                i = 1;
            case 37:
                if (i -= 2 < -1) i = -1;
            case 39:
                if (++i > L) i = L;
                return 1;
            default:
                i = I.gC()[0];
                while (i < L && S[i]) {
                    i++
                }
                if (i == L) return 0;

                c = String.fromCharCode(c)
                if (R(M.charAt(i)).test(c)) {
                    D(1);
                    $[i++] = c;
                    j++;
                    while (i < L && S[i]) {
                        i++
                    }
                }
                return 0
        }
    }

    var d = document, c = 'character', y = -100000, L = M.length, G = !c, i = 0, j = 0, $ = M.split(''), S = M.split('');

    for (var k = 0; k < L; k++) if (/a|9|\*/.test($[k])) $[k] = S[k] = 0;
    I = typeof I == 'string' ? d.getElementById(I) : I;

    I.sC = function(l, g) {
        if (this.setSelectionRange) this.setSelectionRange(l, l);
        else {
            g = this.createTextRange();
            g.collapse(true);
            g.moveStart(c, y);
            g.move(c, l);
            g.select();
        }
    }
    I.gC = function(r, b) {
        if (this.setSelectionRange) return [this.selectionStart,this.selectionEnd];
        else {
            r = d['selection'].createRange();
            b = 0 - r.duplicate().moveStart(c, y)
            return [b,b + r.text.length]
        }
    }
    I.onfocus = function() {
        this.value = N('_');
        setTimeout(function() {
            I.sC(j ? i : 0)
        }, 0)
    }
    I.onblur = function() {
        this.value = j ? N(' ') : ''
    }
    I.onkeydown = function(e, c) {
        e = e || event;
        c = e.keyCode || e.charCode;

        i = this.gC()[0];

        if (c == 8 || c == 46) {
            G = true;
            P(c);
            this.value = N('_');
            this.sC(i);
            return !G
        }
        else if (!window.netscape && (c > 34 && c < 38 || c == 39)) P(c)
    }
    I.onkeypress = function(e) {
        if (G) return G = !G;

        e = e || event;

        if (P(e.keyCode || e.charCode)) return !G;

        this.value = N('_');
        this.sC(i);

        return G
    }

    if (d.all && !window.opera) I.onpaste = V;
    else I.addEventListener('input', V, false)
}
// конец масски
